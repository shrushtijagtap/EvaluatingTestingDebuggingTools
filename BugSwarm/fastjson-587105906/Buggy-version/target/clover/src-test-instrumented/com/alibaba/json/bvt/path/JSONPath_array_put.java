/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONPath;

import junit.framework.TestCase;

public class JSONPath_array_put extends TestCase {static class __CLR4_1_101phw1phwluszwe9f{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,79757,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_put() throws Exception {__CLR4_1_101phw1phwluszwe9f.R.globalSliceStart(getClass().getName(),79700);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10meyynd1phw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phw1phwluszwe9f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phw1phwluszwe9f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79700,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10meyynd1phw() throws Exception{try{__CLR4_1_101phw1phwluszwe9f.R.inc(79700);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79701);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_1_101phw1phwluszwe9f.R.inc(79702);List list = new ArrayList();
        __CLR4_1_101phw1phwluszwe9f.R.inc(79703);root.put("values", list);

        __CLR4_1_101phw1phwluszwe9f.R.inc(79704);JSONPath path = new JSONPath("$.values");
        __CLR4_1_101phw1phwluszwe9f.R.inc(79705);path.arrayAdd(root, 123);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79706);path.arrayAdd(root, (Object[]) null);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79707);path.arrayAdd(root, new Object[0]);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79708);path.arrayAdd(null, new Object[] { 1 });

        __CLR4_1_101phw1phwluszwe9f.R.inc(79709);Assert.assertEquals(1, list.size());
        __CLR4_1_101phw1phwluszwe9f.R.inc(79710);Assert.assertEquals(123, ((Integer) list.get(0)).intValue());
    }finally{__CLR4_1_101phw1phwluszwe9f.R.flushNeeded();}}

    public void test_set() throws Exception {__CLR4_1_101phw1phwluszwe9f.R.globalSliceStart(getClass().getName(),79711);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xan8ro1pi7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phw1phwluszwe9f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phw1phwluszwe9f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_set",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79711,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xan8ro1pi7() throws Exception{try{__CLR4_1_101phw1phwluszwe9f.R.inc(79711);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79712);List<int[]> list = new ArrayList<int[]>();
        __CLR4_1_101phw1phwluszwe9f.R.inc(79713);list.add(new int[0]);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79714);list.add(new int[0]);

        __CLR4_1_101phw1phwluszwe9f.R.inc(79715);JSONPath path = new JSONPath("$[0]");
        __CLR4_1_101phw1phwluszwe9f.R.inc(79716);path.arrayAdd(list, 123);

        __CLR4_1_101phw1phwluszwe9f.R.inc(79717);Assert.assertEquals(1, list.get(0).length);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79718);Assert.assertEquals(123, ((int[]) list.get(0))[0]);
    }finally{__CLR4_1_101phw1phwluszwe9f.R.flushNeeded();}}

    public void test_set_2() throws Exception {__CLR4_1_101phw1phwluszwe9f.R.globalSliceStart(getClass().getName(),79719);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pu04k11pif();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phw1phwluszwe9f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phw1phwluszwe9f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_set_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79719,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pu04k11pif() throws Exception{try{__CLR4_1_101phw1phwluszwe9f.R.inc(79719);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79720);Object[] list = new Object[2];
        __CLR4_1_101phw1phwluszwe9f.R.inc(79721);list[0] = new int[0];
        __CLR4_1_101phw1phwluszwe9f.R.inc(79722);list[0] = new int[0];

        __CLR4_1_101phw1phwluszwe9f.R.inc(79723);JSONPath path = new JSONPath("$[0]");
        __CLR4_1_101phw1phwluszwe9f.R.inc(79724);path.arrayAdd(list, 123);

        __CLR4_1_101phw1phwluszwe9f.R.inc(79725);Assert.assertEquals(1, ((int[]) list[0]).length);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79726);Assert.assertEquals(123, ((int[]) list[0])[0]);
    }finally{__CLR4_1_101phw1phwluszwe9f.R.flushNeeded();}}

    public void test_put_array_int() throws Exception {__CLR4_1_101phw1phwluszwe9f.R.globalSliceStart(getClass().getName(),79727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zeqtzh1pin();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phw1phwluszwe9f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phw1phwluszwe9f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79727,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zeqtzh1pin() throws Exception{try{__CLR4_1_101phw1phwluszwe9f.R.inc(79727);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79728);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_1_101phw1phwluszwe9f.R.inc(79729);root.put("values", new int[0]);

        __CLR4_1_101phw1phwluszwe9f.R.inc(79730);JSONPath path = new JSONPath("$.values");
        __CLR4_1_101phw1phwluszwe9f.R.inc(79731);path.arrayAdd(root, 123);

        __CLR4_1_101phw1phwluszwe9f.R.inc(79732);int[] array = (int[]) root.get("values");
        __CLR4_1_101phw1phwluszwe9f.R.inc(79733);Assert.assertEquals(1, array.length);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79734);Assert.assertEquals(123, array[0]);
    }finally{__CLR4_1_101phw1phwluszwe9f.R.flushNeeded();}}

    public void test_put_array_long() throws Exception {__CLR4_1_101phw1phwluszwe9f.R.globalSliceStart(getClass().getName(),79735);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gx1a4m1piv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phw1phwluszwe9f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phw1phwluszwe9f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79735,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gx1a4m1piv() throws Exception{try{__CLR4_1_101phw1phwluszwe9f.R.inc(79735);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79736);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_1_101phw1phwluszwe9f.R.inc(79737);root.put("values", new long[0]);

        __CLR4_1_101phw1phwluszwe9f.R.inc(79738);JSONPath path = new JSONPath("$.values");
        __CLR4_1_101phw1phwluszwe9f.R.inc(79739);path.arrayAdd(root, 123);

        __CLR4_1_101phw1phwluszwe9f.R.inc(79740);long[] array = (long[]) root.get("values");
        __CLR4_1_101phw1phwluszwe9f.R.inc(79741);Assert.assertEquals(1, array.length);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79742);Assert.assertEquals(123, array[0]);
    }finally{__CLR4_1_101phw1phwluszwe9f.R.flushNeeded();}}

    public void test_put_array_error_0() throws Exception {__CLR4_1_101phw1phwluszwe9f.R.globalSliceStart(getClass().getName(),79743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v2zpkz1pj3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phw1phwluszwe9f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phw1phwluszwe9f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79743,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v2zpkz1pj3() throws Exception{try{__CLR4_1_101phw1phwluszwe9f.R.inc(79743);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79744);Exception error = null;
        __CLR4_1_101phw1phwluszwe9f.R.inc(79745);try {
            __CLR4_1_101phw1phwluszwe9f.R.inc(79746);JSONPath path = new JSONPath("$.values");
            __CLR4_1_101phw1phwluszwe9f.R.inc(79747);path.arrayAdd(new Object(), 123);
        } catch (JSONException ex) {
            __CLR4_1_101phw1phwluszwe9f.R.inc(79748);error = ex;
        }
        __CLR4_1_101phw1phwluszwe9f.R.inc(79749);Assert.assertNotNull(error);
    }finally{__CLR4_1_101phw1phwluszwe9f.R.flushNeeded();}}
    
    public void test_put_array_error_1() throws Exception {__CLR4_1_101phw1phwluszwe9f.R.globalSliceStart(getClass().getName(),79750);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rtzqsi1pja();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101phw1phwluszwe9f.R.rethrow($CLV_t2$);}finally{__CLR4_1_101phw1phwluszwe9f.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79750,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rtzqsi1pja() throws Exception{try{__CLR4_1_101phw1phwluszwe9f.R.inc(79750);
        __CLR4_1_101phw1phwluszwe9f.R.inc(79751);Exception error = null;
        __CLR4_1_101phw1phwluszwe9f.R.inc(79752);try {
            __CLR4_1_101phw1phwluszwe9f.R.inc(79753);JSONPath path = new JSONPath("$.values");
            __CLR4_1_101phw1phwluszwe9f.R.inc(79754);path.arrayAdd(Collections.singletonMap("values", new Object()), 123);
        } catch (JSONException ex) {
            __CLR4_1_101phw1phwluszwe9f.R.inc(79755);error = ex;
        }
        __CLR4_1_101phw1phwluszwe9f.R.inc(79756);Assert.assertNotNull(error);
    }finally{__CLR4_1_101phw1phwluszwe9f.R.flushNeeded();}}
}
