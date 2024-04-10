/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.serializer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

public class SimplePropertyPreFilterTest extends TestCase {static class __CLR4_5_21t9n1t9nlusyjv39{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,84666,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private VO vo;
    
    private A a;
    
    private Map<String, Object> map;

    protected void setUp() throws Exception {try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84587);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84588);vo = new VO();
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84589);vo.setId(123);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84590);vo.setName("sandzhangtoo");
        
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84591);a = new A();
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84592);a.setId(123);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84593);a.setName("sandzhangtoo");
        
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84594);map = new HashMap<String, Object>();
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84595);map.put("id", 123);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84596);map.put("name", "sandzhangtoo");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84597);map.put(null, null);
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}

    public void test_name() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84598);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i320db1t9y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84598,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i320db1t9y() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84598);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84599);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84600);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_name_0() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84601);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2m2598w1ta1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84601,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2m2598w1ta1() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84601);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84602);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84603);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_name_a() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84604);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_24vf0fz1ta4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_a",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84604,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_24vf0fz1ta4() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84604);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84605);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84606);Assert.assertEquals(VO.class, filter.getClazz());
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84607);Assert.assertEquals(1, filter.getIncludes().size());
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84608);Assert.assertTrue(filter.apply(null, null, null));
        
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84609);String text = JSON.toJSONString(a, filter);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84610);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_name_a1() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84611);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ujr00u1tab();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_a1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84611,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ujr00u1tab() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84611);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84612);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84613);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(a, filter));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_id() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84614);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pol32p1tae();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_id",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84614,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pol32p1tae() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84614);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84615);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "id");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84616);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_id_0() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84617);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wmzpz41tah();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_id_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84617,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wmzpz41tah() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84617);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84618);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("id");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84619);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_map() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84620);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaqgyy1tak();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84620,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaqgyy1tak() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84620);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84621);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84622);String text = JSON.toJSONString(map, filter);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84623);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_map_id() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84624);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2so7am1tao();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map_id",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84624,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2so7am1tao() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84624);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84625);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("id");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84626);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(map, filter));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_map_name() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84627);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23f44n21tar();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map_name",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84627,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23f44n21tar() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84627);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84628);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84629);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(map, filter));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_all() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84630);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pxmdol1tau();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_all",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84630,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pxmdol1tau() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84630);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84631);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84632);String text = JSON.toJSONString(vo, filter);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84633);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_all_map() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84634);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_22zluq01tay();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_all_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84634,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_22zluq01tay() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84634);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84635);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84636);String text = JSON.toJSONString(map, filter);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84637);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_exclude_id() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2hgqxas1tb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_id",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84638,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2hgqxas1tb2() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84638);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84639);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84640);filter.getExcludes().add("id");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84641);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_exclude_id_map() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84642);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2d7u0z31tb6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_id_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84642,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2d7u0z31tb6() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84642);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84643);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84644);filter.getExcludes().add("id");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84645);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
    
    public void test_exclude_name() throws Exception {__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceStart(getClass().getName(),84646);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_21evyf81tba();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21t9n1t9nlusyjv39.R.rethrow($CLV_t2$);}finally{__CLR4_5_21t9n1t9nlusyjv39.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_name",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),84646,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_21evyf81tba() throws Exception{try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84646);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84647);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84648);filter.getExcludes().add("name");
        __CLR4_5_21t9n1t9nlusyjv39.R.inc(84649);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}

    public static class VO {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84650);
            __CLR4_5_21t9n1t9nlusyjv39.R.inc(84651);return id;
        }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84652);
            __CLR4_5_21t9n1t9nlusyjv39.R.inc(84653);this.id = id;
        }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}

        public String getName() {try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84654);
            __CLR4_5_21t9n1t9nlusyjv39.R.inc(84655);return name;
        }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84656);
            __CLR4_5_21t9n1t9nlusyjv39.R.inc(84657);this.name = name;
        }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}

    }
    
    public static class A {
        
        private int    id;
        private String name;
        
        public int getId() {try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84658);
            __CLR4_5_21t9n1t9nlusyjv39.R.inc(84659);return id;
        }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
        
        public void setId(int id) {try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84660);
            __CLR4_5_21t9n1t9nlusyjv39.R.inc(84661);this.id = id;
        }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
        
        public String getName() {try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84662);
            __CLR4_5_21t9n1t9nlusyjv39.R.inc(84663);return name;
        }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
        
        public void setName(String name) {try{__CLR4_5_21t9n1t9nlusyjv39.R.inc(84664);
            __CLR4_5_21t9n1t9nlusyjv39.R.inc(84665);this.name = name;
        }finally{__CLR4_5_21t9n1t9nlusyjv39.R.flushNeeded();}}
        
    }
}
