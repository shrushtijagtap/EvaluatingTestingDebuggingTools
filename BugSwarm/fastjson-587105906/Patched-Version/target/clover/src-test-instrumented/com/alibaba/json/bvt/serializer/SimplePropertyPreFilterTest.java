/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

public class SimplePropertyPreFilterTest extends TestCase {static class __CLR4_5_21u7v1u7vlusvngld{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,85898,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private VO vo;
    
    private A a;
    
    private Map<String, Object> map;

    protected void setUp() throws Exception {try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85819);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85820);vo = new VO();
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85821);vo.setId(123);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85822);vo.setName("sandzhangtoo");
        
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85823);a = new A();
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85824);a.setId(123);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85825);a.setName("sandzhangtoo");
        
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85826);map = new HashMap<String, Object>();
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85827);map.put("id", 123);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85828);map.put("name", "sandzhangtoo");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85829);map.put(null, null);
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}

    public void test_name() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85830);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i320db1u86();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85830,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i320db1u86() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85830);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85831);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85832);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_name_0() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m2598w1u89();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85833,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m2598w1u89() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85833);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85834);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85835);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_name_a() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85836);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vf0fz1u8c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_a",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85836,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vf0fz1u8c() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85836);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85837);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85838);Assert.assertEquals(VO.class, filter.getClazz());
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85839);Assert.assertEquals(1, filter.getIncludes().size());
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85840);Assert.assertTrue(filter.apply(null, null, null));
        
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85841);String text = JSON.toJSONString(a, filter);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85842);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_name_a1() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujr00u1u8j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_a1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85843,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujr00u1u8j() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85843);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85844);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85845);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(a, filter));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_id() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pol32p1u8m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_id",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85846,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pol32p1u8m() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85846);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85847);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "id");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85848);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_id_0() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85849);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wmzpz41u8p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_id_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85849,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wmzpz41u8p() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85849);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85850);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("id");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85851);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_map() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaqgyy1u8s();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85852,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaqgyy1u8s() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85852);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85853);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85854);String text = JSON.toJSONString(map, filter);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85855);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_map_id() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85856);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2so7am1u8w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map_id",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85856,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2so7am1u8w() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85856);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85857);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("id");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85858);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(map, filter));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_map_name() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85859);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23f44n21u8z();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map_name",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85859,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23f44n21u8z() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85859);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85860);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85861);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(map, filter));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_all() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85862);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pxmdol1u92();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_all",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85862,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pxmdol1u92() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85862);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85863);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85864);String text = JSON.toJSONString(vo, filter);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85865);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_all_map() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85866);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22zluq01u96();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_all_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85866,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22zluq01u96() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85866);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85867);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85868);String text = JSON.toJSONString(map, filter);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85869);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_exclude_id() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hgqxas1u9a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_id",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85870,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hgqxas1u9a() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85870);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85871);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85872);filter.getExcludes().add("id");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85873);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_exclude_id_map() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85874);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d7u0z31u9e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_id_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85874,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d7u0z31u9e() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85874);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85875);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85876);filter.getExcludes().add("id");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85877);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
    
    public void test_exclude_name() throws Exception {__CLR4_5_21u7v1u7vlusvngld.R.globalSliceStart(getClass().getName(),85878);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21evyf81u9i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21u7v1u7vlusvngld.R.rethrow($CLV_t2$);}finally{__CLR4_5_21u7v1u7vlusvngld.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_name",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),85878,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21evyf81u9i() throws Exception{try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85878);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85879);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85880);filter.getExcludes().add("name");
        __CLR4_5_21u7v1u7vlusvngld.R.inc(85881);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}

    public static class VO {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85882);
            __CLR4_5_21u7v1u7vlusvngld.R.inc(85883);return id;
        }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85884);
            __CLR4_5_21u7v1u7vlusvngld.R.inc(85885);this.id = id;
        }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85886);
            __CLR4_5_21u7v1u7vlusvngld.R.inc(85887);return name;
        }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85888);
            __CLR4_5_21u7v1u7vlusvngld.R.inc(85889);this.name = name;
        }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}

    }
    
    public static class A {
        
        private int    id;
        private String name;
        
        public int getId() {try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85890);
            __CLR4_5_21u7v1u7vlusvngld.R.inc(85891);return id;
        }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
        
        public void setId(int id) {try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85892);
            __CLR4_5_21u7v1u7vlusvngld.R.inc(85893);this.id = id;
        }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
        
        public String getName() {try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85894);
            __CLR4_5_21u7v1u7vlusvngld.R.inc(85895);return name;
        }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
        
        public void setName(String name) {try{__CLR4_5_21u7v1u7vlusvngld.R.inc(85896);
            __CLR4_5_21u7v1u7vlusvngld.R.inc(85897);this.name = name;
        }finally{__CLR4_5_21u7v1u7vlusvngld.R.flushNeeded();}}
        
    }
}
