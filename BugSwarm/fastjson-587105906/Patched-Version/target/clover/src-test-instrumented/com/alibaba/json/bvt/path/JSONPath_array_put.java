/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONPath;

import junit.framework.TestCase;

public class JSONPath_array_put extends TestCase {static class __CLR4_5_21ojd1ojdlusyjuiu{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,78514,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_put() throws Exception {__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceStart(getClass().getName(),78457);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2meyynd1ojd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ojd1ojdlusyjuiu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78457,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2meyynd1ojd() throws Exception{try{__CLR4_5_21ojd1ojdlusyjuiu.R.inc(78457);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78458);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78459);List list = new ArrayList();
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78460);root.put("values", list);

        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78461);JSONPath path = new JSONPath("$.values");
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78462);path.arrayAdd(root, 123);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78463);path.arrayAdd(root, (Object[]) null);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78464);path.arrayAdd(root, new Object[0]);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78465);path.arrayAdd(null, new Object[] { 1 });

        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78466);Assert.assertEquals(1, list.size());
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78467);Assert.assertEquals(123, ((Integer) list.get(0)).intValue());
    }finally{__CLR4_5_21ojd1ojdlusyjuiu.R.flushNeeded();}}

    public void test_set() throws Exception {__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceStart(getClass().getName(),78468);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xan8ro1ojo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ojd1ojdlusyjuiu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_set",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78468,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xan8ro1ojo() throws Exception{try{__CLR4_5_21ojd1ojdlusyjuiu.R.inc(78468);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78469);List<int[]> list = new ArrayList<int[]>();
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78470);list.add(new int[0]);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78471);list.add(new int[0]);

        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78472);JSONPath path = new JSONPath("$[0]");
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78473);path.arrayAdd(list, 123);

        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78474);Assert.assertEquals(1, list.get(0).length);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78475);Assert.assertEquals(123, ((int[]) list.get(0))[0]);
    }finally{__CLR4_5_21ojd1ojdlusyjuiu.R.flushNeeded();}}

    public void test_set_2() throws Exception {__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceStart(getClass().getName(),78476);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2pu04k11ojw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ojd1ojdlusyjuiu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_set_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78476,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2pu04k11ojw() throws Exception{try{__CLR4_5_21ojd1ojdlusyjuiu.R.inc(78476);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78477);Object[] list = new Object[2];
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78478);list[0] = new int[0];
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78479);list[0] = new int[0];

        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78480);JSONPath path = new JSONPath("$[0]");
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78481);path.arrayAdd(list, 123);

        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78482);Assert.assertEquals(1, ((int[]) list[0]).length);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78483);Assert.assertEquals(123, ((int[]) list[0])[0]);
    }finally{__CLR4_5_21ojd1ojdlusyjuiu.R.flushNeeded();}}

    public void test_put_array_int() throws Exception {__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceStart(getClass().getName(),78484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2zeqtzh1ok4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ojd1ojdlusyjuiu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_int",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78484,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2zeqtzh1ok4() throws Exception{try{__CLR4_5_21ojd1ojdlusyjuiu.R.inc(78484);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78485);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78486);root.put("values", new int[0]);

        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78487);JSONPath path = new JSONPath("$.values");
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78488);path.arrayAdd(root, 123);

        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78489);int[] array = (int[]) root.get("values");
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78490);Assert.assertEquals(1, array.length);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78491);Assert.assertEquals(123, array[0]);
    }finally{__CLR4_5_21ojd1ojdlusyjuiu.R.flushNeeded();}}

    public void test_put_array_long() throws Exception {__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceStart(getClass().getName(),78492);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gx1a4m1okc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ojd1ojdlusyjuiu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_long",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78492,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gx1a4m1okc() throws Exception{try{__CLR4_5_21ojd1ojdlusyjuiu.R.inc(78492);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78493);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78494);root.put("values", new long[0]);

        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78495);JSONPath path = new JSONPath("$.values");
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78496);path.arrayAdd(root, 123);

        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78497);long[] array = (long[]) root.get("values");
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78498);Assert.assertEquals(1, array.length);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78499);Assert.assertEquals(123, array[0]);
    }finally{__CLR4_5_21ojd1ojdlusyjuiu.R.flushNeeded();}}

    public void test_put_array_error_0() throws Exception {__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceStart(getClass().getName(),78500);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v2zpkz1okk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ojd1ojdlusyjuiu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78500,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v2zpkz1okk() throws Exception{try{__CLR4_5_21ojd1ojdlusyjuiu.R.inc(78500);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78501);Exception error = null;
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78502);try {
            __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78503);JSONPath path = new JSONPath("$.values");
            __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78504);path.arrayAdd(new Object(), 123);
        } catch (JSONException ex) {
            __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78505);error = ex;
        }
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78506);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ojd1ojdlusyjuiu.R.flushNeeded();}}
    
    public void test_put_array_error_1() throws Exception {__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceStart(getClass().getName(),78507);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rtzqsi1okr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ojd1ojdlusyjuiu.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ojd1ojdlusyjuiu.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_array_put.test_put_array_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),78507,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rtzqsi1okr() throws Exception{try{__CLR4_5_21ojd1ojdlusyjuiu.R.inc(78507);
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78508);Exception error = null;
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78509);try {
            __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78510);JSONPath path = new JSONPath("$.values");
            __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78511);path.arrayAdd(Collections.singletonMap("values", new Object()), 123);
        } catch (JSONException ex) {
            __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78512);error = ex;
        }
        __CLR4_5_21ojd1ojdlusyjuiu.R.inc(78513);Assert.assertNotNull(error);
    }finally{__CLR4_5_21ojd1ojdlusyjuiu.R.flushNeeded();}}
}
