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

public class JSONPath_array_put extends TestCase {static class __CLR4_1_101ojo1ojolusqkiba{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,78525,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_put() throws Exception {__CLR4_1_101ojo1ojolusqkiba.R.globalSliceStart(getClass().getName(),78468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10meyynd1ojo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ojo1ojolusqkiba.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ojo1ojolusqkiba.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78468,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10meyynd1ojo() throws Exception{try{__CLR4_1_101ojo1ojolusqkiba.R.inc(78468);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78469);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78470);List list = new ArrayList();
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78471);root.put("values", list);

        __CLR4_1_101ojo1ojolusqkiba.R.inc(78472);JSONPath path = new JSONPath("$.values");
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78473);path.arrayAdd(root, 123);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78474);path.arrayAdd(root, (Object[]) null);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78475);path.arrayAdd(root, new Object[0]);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78476);path.arrayAdd(null, new Object[] { 1 });

        __CLR4_1_101ojo1ojolusqkiba.R.inc(78477);Assert.assertEquals(1, list.size());
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78478);Assert.assertEquals(123, ((Integer) list.get(0)).intValue());
    }finally{__CLR4_1_101ojo1ojolusqkiba.R.flushNeeded();}}

    public void test_set() throws Exception {__CLR4_1_101ojo1ojolusqkiba.R.globalSliceStart(getClass().getName(),78479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xan8ro1ojz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ojo1ojolusqkiba.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ojo1ojolusqkiba.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_set",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78479,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xan8ro1ojz() throws Exception{try{__CLR4_1_101ojo1ojolusqkiba.R.inc(78479);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78480);List<int[]> list = new ArrayList<int[]>();
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78481);list.add(new int[0]);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78482);list.add(new int[0]);

        __CLR4_1_101ojo1ojolusqkiba.R.inc(78483);JSONPath path = new JSONPath("$[0]");
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78484);path.arrayAdd(list, 123);

        __CLR4_1_101ojo1ojolusqkiba.R.inc(78485);Assert.assertEquals(1, list.get(0).length);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78486);Assert.assertEquals(123, ((int[]) list.get(0))[0]);
    }finally{__CLR4_1_101ojo1ojolusqkiba.R.flushNeeded();}}

    public void test_set_2() throws Exception {__CLR4_1_101ojo1ojolusqkiba.R.globalSliceStart(getClass().getName(),78487);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10pu04k11ok7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ojo1ojolusqkiba.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ojo1ojolusqkiba.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_set_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78487,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10pu04k11ok7() throws Exception{try{__CLR4_1_101ojo1ojolusqkiba.R.inc(78487);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78488);Object[] list = new Object[2];
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78489);list[0] = new int[0];
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78490);list[0] = new int[0];

        __CLR4_1_101ojo1ojolusqkiba.R.inc(78491);JSONPath path = new JSONPath("$[0]");
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78492);path.arrayAdd(list, 123);

        __CLR4_1_101ojo1ojolusqkiba.R.inc(78493);Assert.assertEquals(1, ((int[]) list[0]).length);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78494);Assert.assertEquals(123, ((int[]) list[0])[0]);
    }finally{__CLR4_1_101ojo1ojolusqkiba.R.flushNeeded();}}

    public void test_put_array_int() throws Exception {__CLR4_1_101ojo1ojolusqkiba.R.globalSliceStart(getClass().getName(),78495);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zeqtzh1okf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ojo1ojolusqkiba.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ojo1ojolusqkiba.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_int",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78495,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zeqtzh1okf() throws Exception{try{__CLR4_1_101ojo1ojolusqkiba.R.inc(78495);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78496);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78497);root.put("values", new int[0]);

        __CLR4_1_101ojo1ojolusqkiba.R.inc(78498);JSONPath path = new JSONPath("$.values");
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78499);path.arrayAdd(root, 123);

        __CLR4_1_101ojo1ojolusqkiba.R.inc(78500);int[] array = (int[]) root.get("values");
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78501);Assert.assertEquals(1, array.length);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78502);Assert.assertEquals(123, array[0]);
    }finally{__CLR4_1_101ojo1ojolusqkiba.R.flushNeeded();}}

    public void test_put_array_long() throws Exception {__CLR4_1_101ojo1ojolusqkiba.R.globalSliceStart(getClass().getName(),78503);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gx1a4m1okn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ojo1ojolusqkiba.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ojo1ojolusqkiba.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_long",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78503,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gx1a4m1okn() throws Exception{try{__CLR4_1_101ojo1ojolusqkiba.R.inc(78503);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78504);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78505);root.put("values", new long[0]);

        __CLR4_1_101ojo1ojolusqkiba.R.inc(78506);JSONPath path = new JSONPath("$.values");
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78507);path.arrayAdd(root, 123);

        __CLR4_1_101ojo1ojolusqkiba.R.inc(78508);long[] array = (long[]) root.get("values");
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78509);Assert.assertEquals(1, array.length);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78510);Assert.assertEquals(123, array[0]);
    }finally{__CLR4_1_101ojo1ojolusqkiba.R.flushNeeded();}}

    public void test_put_array_error_0() throws Exception {__CLR4_1_101ojo1ojolusqkiba.R.globalSliceStart(getClass().getName(),78511);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v2zpkz1okv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ojo1ojolusqkiba.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ojo1ojolusqkiba.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78511,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v2zpkz1okv() throws Exception{try{__CLR4_1_101ojo1ojolusqkiba.R.inc(78511);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78512);Exception error = null;
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78513);try {
            __CLR4_1_101ojo1ojolusqkiba.R.inc(78514);JSONPath path = new JSONPath("$.values");
            __CLR4_1_101ojo1ojolusqkiba.R.inc(78515);path.arrayAdd(new Object(), 123);
        } catch (JSONException ex) {
            __CLR4_1_101ojo1ojolusqkiba.R.inc(78516);error = ex;
        }
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78517);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ojo1ojolusqkiba.R.flushNeeded();}}
    
    public void test_put_array_error_1() throws Exception {__CLR4_1_101ojo1ojolusqkiba.R.globalSliceStart(getClass().getName(),78518);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rtzqsi1ol2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ojo1ojolusqkiba.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ojo1ojolusqkiba.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),78518,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rtzqsi1ol2() throws Exception{try{__CLR4_1_101ojo1ojolusqkiba.R.inc(78518);
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78519);Exception error = null;
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78520);try {
            __CLR4_1_101ojo1ojolusqkiba.R.inc(78521);JSONPath path = new JSONPath("$.values");
            __CLR4_1_101ojo1ojolusqkiba.R.inc(78522);path.arrayAdd(Collections.singletonMap("values", new Object()), 123);
        } catch (JSONException ex) {
            __CLR4_1_101ojo1ojolusqkiba.R.inc(78523);error = ex;
        }
        __CLR4_1_101ojo1ojolusqkiba.R.inc(78524);Assert.assertNotNull(error);
    }finally{__CLR4_1_101ojo1ojolusqkiba.R.flushNeeded();}}
}
