/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;

public class SimplePropertyPreFilterTest extends TestCase {static class __CLR4_1_101t9y1t9ylusqkk9z{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,84677,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    private VO vo;
    
    private A a;
    
    private Map<String, Object> map;

    protected void setUp() throws Exception {try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84598);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84599);vo = new VO();
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84600);vo.setId(123);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84601);vo.setName("sandzhangtoo");
        
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84602);a = new A();
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84603);a.setId(123);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84604);a.setName("sandzhangtoo");
        
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84605);map = new HashMap<String, Object>();
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84606);map.put("id", 123);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84607);map.put("name", "sandzhangtoo");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84608);map.put(null, null);
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}

    public void test_name() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84609);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i320db1ta9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84609,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i320db1ta9() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84609);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84610);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84611);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_name_0() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84612);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10m2598w1tac();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84612,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10m2598w1tac() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84612);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84613);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84614);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_name_a() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84615);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104vf0fz1taf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_a",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84615,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104vf0fz1taf() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84615);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84616);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84617);Assert.assertEquals(VO.class, filter.getClazz());
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84618);Assert.assertEquals(1, filter.getIncludes().size());
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84619);Assert.assertTrue(filter.apply(null, null, null));
        
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84620);String text = JSON.toJSONString(a, filter);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84621);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_name_a1() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84622);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ujr00u1tam();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_name_a1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84622,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ujr00u1tam() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84622);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84623);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84624);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(a, filter));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_id() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84625);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pol32p1tap();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_id",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84625,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pol32p1tap() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84625);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84626);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "id");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84627);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_id_0() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84628);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wmzpz41tas();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_id_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84628,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wmzpz41tas() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84628);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84629);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("id");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84630);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_map() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84631);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aaqgyy1tav();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84631,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aaqgyy1tav() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84631);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84632);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class, "name");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84633);String text = JSON.toJSONString(map, filter);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84634);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_map_id() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84635);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10so7am1taz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map_id",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84635,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10so7am1taz() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84635);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84636);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("id");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84637);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(map, filter));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_map_name() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84638);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103f44n21tb2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_map_name",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84638,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103f44n21tb2() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84638);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84639);SimplePropertyPreFilter filter = new SimplePropertyPreFilter("name");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84640);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(map, filter));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_all() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84641);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pxmdol1tb5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_all",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84641,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pxmdol1tb5() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84641);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84642);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84643);String text = JSON.toJSONString(vo, filter);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84644);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_all_map() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84645);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102zluq01tb9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_all_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84645,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102zluq01tb9() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84645);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84646);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84647);String text = JSON.toJSONString(map, filter);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84648);Assert.assertTrue("{\"id\":123,\"name\":\"sandzhangtoo\"}".equals(text) || "{\"name\":\"sandzhangtoo\",\"id\":123}".equals(text));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_exclude_id() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84649);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hgqxas1tbd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_id",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84649,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hgqxas1tbd() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84649);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84650);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84651);filter.getExcludes().add("id");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84652);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_exclude_id_map() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84653);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10d7u0z31tbh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_id_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84653,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10d7u0z31tbh() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84653);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84654);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84655);filter.getExcludes().add("id");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84656);Assert.assertEquals("{\"name\":\"sandzhangtoo\"}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
    
    public void test_exclude_name() throws Exception {__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceStart(getClass().getName(),84657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101evyf81tbl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101t9y1t9ylusqkk9z.R.rethrow($CLV_t2$);}finally{__CLR4_1_101t9y1t9ylusqkk9z.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.SimplePropertyPreFilterTest.test_exclude_name",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),84657,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101evyf81tbl() throws Exception{try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84657);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84658);SimplePropertyPreFilter filter = new SimplePropertyPreFilter(VO.class);
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84659);filter.getExcludes().add("name");
        __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84660);Assert.assertEquals("{\"id\":123}", JSON.toJSONString(vo, filter));
    }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}

    public static class VO {

        private int    id;
        private String name;

        public int getId() {try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84661);
            __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84662);return id;
        }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84663);
            __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84664);this.id = id;
        }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84665);
            __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84666);return name;
        }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84667);
            __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84668);this.name = name;
        }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}

    }
    
    public static class A {
        
        private int    id;
        private String name;
        
        public int getId() {try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84669);
            __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84670);return id;
        }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
        
        public void setId(int id) {try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84671);
            __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84672);this.id = id;
        }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
        
        public String getName() {try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84673);
            __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84674);return name;
        }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
        
        public void setName(String name) {try{__CLR4_1_101t9y1t9ylusqkk9z.R.inc(84675);
            __CLR4_1_101t9y1t9ylusqkk9z.R.inc(84676);this.name = name;
        }finally{__CLR4_1_101t9y1t9ylusqkk9z.R.flushNeeded();}}
        
    }
}
