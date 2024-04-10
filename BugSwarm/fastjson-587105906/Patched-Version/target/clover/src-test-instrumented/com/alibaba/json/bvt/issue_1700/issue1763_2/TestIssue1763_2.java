/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.issue_1700.issue1763_2;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.json.bvt.issue_1700.issue1763_2.bean.BaseResult;
import com.alibaba.json.bvt.issue_1700.issue1763_2.bean.CouponResult;
import com.alibaba.json.bvt.issue_1700.issue1763_2.bean.PageResult;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Test Issue 1763_2
 * \u5982\u679c\u6709\u591a\u5c42\u6cdb\u578b\u4e14\u524d\u9762\u6cdb\u578b\u5df2\u7ecf\u5b9e\u73b0\u7684\u60c5\u51b5\u4e0b\uff0c\u5224\u65ad\u4e0b\u4e00\u7ea7\u6cdb\u578b
 * @author cnlyml
 */
public class TestIssue1763_2<T> {static class __CLR4_5_21cg61cg6lusyjt0w{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,62806,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    private String jsonStr;
    private Class<T> clazz;

    @Before
    public void init() {try{__CLR4_5_21cg61cg6lusyjt0w.R.inc(62790);
        __CLR4_5_21cg61cg6lusyjt0w.R.inc(62791);jsonStr = "{\"code\":0, \"message\":\"Success\", \"content\":{\"pageNum\":1, \"pageSize\":2, \"size\":2, \"startRow\":1, \"endRow\":1, \"total\":2, \"pages\":1, \"list\":[{\"id\":10000001, \"couponName\":\"Test1\"}, {\"id\":10000002, \"couponName\": \"Test2\"}]}}";
        __CLR4_5_21cg61cg6lusyjt0w.R.inc(62792);clazz = (Class<T>) CouponResult.class;
    }finally{__CLR4_5_21cg61cg6lusyjt0w.R.flushNeeded();}}

    // \u4fee\u590dtest
    @Test
    public void testFixBug1763_2() {__CLR4_5_21cg61cg6lusyjt0w.R.globalSliceStart(getClass().getName(),62793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_27p8hbm1cg9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cg61cg6lusyjt0w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cg61cg6lusyjt0w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1700.issue1763_2.TestIssue1763_2.testFixBug1763_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),62793,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_27p8hbm1cg9(){try{__CLR4_5_21cg61cg6lusyjt0w.R.inc(62793);
        __CLR4_5_21cg61cg6lusyjt0w.R.inc(62794);BaseResult<PageResult<CouponResult>> data = JSON.parseObject(jsonStr, new TypeReference<BaseResult<PageResult<T>>>(clazz){}.getType());

        __CLR4_5_21cg61cg6lusyjt0w.R.inc(62795);Assert.assertTrue(data.isSuccess());
        __CLR4_5_21cg61cg6lusyjt0w.R.inc(62796);Assert.assertTrue(data.getContent().getList().size() == 2);
        __CLR4_5_21cg61cg6lusyjt0w.R.inc(62797);Assert.assertTrue(data.getContent().getList().get(0).getId().equals(10000001L));
        __CLR4_5_21cg61cg6lusyjt0w.R.inc(62798);Assert.assertEquals(CouponResult.class, data.getContent().getList().get(0).getClass());
    }finally{__CLR4_5_21cg61cg6lusyjt0w.R.flushNeeded();}}

    // \u590d\u73b0BUG
    @Test
    public void testBug1763_2() {__CLR4_5_21cg61cg6lusyjt0w.R.globalSliceStart(getClass().getName(),62799);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2czx4m71cgf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21cg61cg6lusyjt0w.R.rethrow($CLV_t2$);}finally{__CLR4_5_21cg61cg6lusyjt0w.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1700.issue1763_2.TestIssue1763_2.testBug1763_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),62799,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2czx4m71cgf(){try{__CLR4_5_21cg61cg6lusyjt0w.R.inc(62799);
        __CLR4_5_21cg61cg6lusyjt0w.R.inc(62800);BaseResult<PageResult<CouponResult>> data = JSON.parseObject(jsonStr, new TypeReferenceBug1763_2<BaseResult<PageResult<T>>>(clazz){}.getType());

        __CLR4_5_21cg61cg6lusyjt0w.R.inc(62801);Assert.assertTrue(data.isSuccess());
        __CLR4_5_21cg61cg6lusyjt0w.R.inc(62802);Assert.assertTrue(data.getContent().getList().size() == 2);
        __CLR4_5_21cg61cg6lusyjt0w.R.inc(62803);try {
            __CLR4_5_21cg61cg6lusyjt0w.R.inc(62804);data.getContent().getList().get(0).getId();
        } catch (Throwable ex) {
            __CLR4_5_21cg61cg6lusyjt0w.R.inc(62805);Assert.assertEquals(ex.getCause() instanceof ClassCastException, false);
        }
    }finally{__CLR4_5_21cg61cg6lusyjt0w.R.flushNeeded();}}
}
