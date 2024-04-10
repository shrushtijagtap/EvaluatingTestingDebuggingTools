/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONPathException;
import com.alibaba.json.bvt.path.JSONPath_between_int.Entity;

import junit.framework.TestCase;

public class JSONPath_size extends TestCase {static class __CLR4_5_21puo1puolusyjups{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,80203,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_root() throws Exception {__CLR4_5_21puo1puolusyjups.R.globalSliceStart(getClass().getName(),80160);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q9nvvu1puo();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21puo1puolusyjups.R.rethrow($CLV_t2$);}finally{__CLR4_5_21puo1puolusyjups.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_root",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80160,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q9nvvu1puo() throws Exception{try{__CLR4_5_21puo1puolusyjups.R.inc(80160);
        __CLR4_5_21puo1puolusyjups.R.inc(80161);List list = new ArrayList();
        __CLR4_5_21puo1puolusyjups.R.inc(80162);list.add(new Entity(101, "kiki"));
        __CLR4_5_21puo1puolusyjups.R.inc(80163);list.add(new Entity(102, "ljw2083"));
        __CLR4_5_21puo1puolusyjups.R.inc(80164);list.add(new Entity(103, "ljw2083"));

        __CLR4_5_21puo1puolusyjups.R.inc(80165);Assert.assertEquals(3, JSONPath.size(list, "$"));
    }finally{__CLR4_5_21puo1puolusyjups.R.flushNeeded();}}

    public void test_path() throws Exception {__CLR4_5_21puo1puolusyjups.R.globalSliceStart(getClass().getName(),80166);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wh3d151puu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21puo1puolusyjups.R.rethrow($CLV_t2$);}finally{__CLR4_5_21puo1puolusyjups.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80166,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wh3d151puu() throws Exception{try{__CLR4_5_21puo1puolusyjups.R.inc(80166);
        __CLR4_5_21puo1puolusyjups.R.inc(80167);List list = new ArrayList();
        __CLR4_5_21puo1puolusyjups.R.inc(80168);list.add(new Entity(101, "kiki"));
        __CLR4_5_21puo1puolusyjups.R.inc(80169);list.add(new Entity(102, "ljw2083"));
        __CLR4_5_21puo1puolusyjups.R.inc(80170);list.add(new Entity(103, "ljw2083"));

        __CLR4_5_21puo1puolusyjups.R.inc(80171);JSONObject root = new JSONObject();
        __CLR4_5_21puo1puolusyjups.R.inc(80172);root.put("values", list);

        __CLR4_5_21puo1puolusyjups.R.inc(80173);Assert.assertEquals(3, JSONPath.size(root, "$.values"));
    }finally{__CLR4_5_21puo1puolusyjups.R.flushNeeded();}}

    public void test_path_size() throws Exception {__CLR4_5_21puo1puolusyjups.R.globalSliceStart(getClass().getName(),80174);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cbj28b1pv2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21puo1puolusyjups.R.rethrow($CLV_t2$);}finally{__CLR4_5_21puo1puolusyjups.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80174,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cbj28b1pv2() throws Exception{try{__CLR4_5_21puo1puolusyjups.R.inc(80174);
        __CLR4_5_21puo1puolusyjups.R.inc(80175);JSONPath path = JSONPath.compile("$");

        __CLR4_5_21puo1puolusyjups.R.inc(80176);Assert.assertEquals(-1, path.size(null));
    }finally{__CLR4_5_21puo1puolusyjups.R.flushNeeded();}}

    public void test_path_size_1() throws Exception {__CLR4_5_21puo1puolusyjups.R.globalSliceStart(getClass().getName(),80177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qkqwh31pv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21puo1puolusyjups.R.rethrow($CLV_t2$);}finally{__CLR4_5_21puo1puolusyjups.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80177,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qkqwh31pv5() throws Exception{try{__CLR4_5_21puo1puolusyjups.R.inc(80177);
        __CLR4_5_21puo1puolusyjups.R.inc(80178);List list = new ArrayList();
        __CLR4_5_21puo1puolusyjups.R.inc(80179);list.add(new Entity(101, "kiki"));
        __CLR4_5_21puo1puolusyjups.R.inc(80180);list.add(new Entity(102, "ljw2083"));
        __CLR4_5_21puo1puolusyjups.R.inc(80181);list.add(new Entity(103, "ljw2083"));

        __CLR4_5_21puo1puolusyjups.R.inc(80182);JSONPath path = JSONPath.compile("$");

        __CLR4_5_21puo1puolusyjups.R.inc(80183);Assert.assertEquals(3, path.size(list));
    }finally{__CLR4_5_21puo1puolusyjups.R.flushNeeded();}}

    public void test_path_size_2() throws Exception {__CLR4_5_21puo1puolusyjups.R.globalSliceStart(getClass().getName(),80184);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ttqv9k1pvc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21puo1puolusyjups.R.rethrow($CLV_t2$);}finally{__CLR4_5_21puo1puolusyjups.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80184,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ttqv9k1pvc() throws Exception{try{__CLR4_5_21puo1puolusyjups.R.inc(80184);
        __CLR4_5_21puo1puolusyjups.R.inc(80185);List list = new ArrayList();
        __CLR4_5_21puo1puolusyjups.R.inc(80186);list.add(new Entity(101, "kiki"));
        __CLR4_5_21puo1puolusyjups.R.inc(80187);list.add(new Entity(102, "ljw2083"));
        __CLR4_5_21puo1puolusyjups.R.inc(80188);list.add(new Entity(103, "ljw2083"));

        __CLR4_5_21puo1puolusyjups.R.inc(80189);JSONObject root = new JSONObject();
        __CLR4_5_21puo1puolusyjups.R.inc(80190);root.put("values", list);

        __CLR4_5_21puo1puolusyjups.R.inc(80191);JSONPath path = JSONPath.compile("$.values");

        __CLR4_5_21puo1puolusyjups.R.inc(80192);Assert.assertEquals(3, path.size(root));
    }finally{__CLR4_5_21puo1puolusyjups.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21puo1puolusyjups.R.globalSliceStart(getClass().getName(),80193);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1pvl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21puo1puolusyjups.R.rethrow($CLV_t2$);}finally{__CLR4_5_21puo1puolusyjups.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),80193,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1pvl() throws Exception{try{__CLR4_5_21puo1puolusyjups.R.inc(80193);
        __CLR4_5_21puo1puolusyjups.R.inc(80194);ErrorSizeBean obj = new ErrorSizeBean();

        __CLR4_5_21puo1puolusyjups.R.inc(80195);Exception error = null;
        __CLR4_5_21puo1puolusyjups.R.inc(80196);try {
            __CLR4_5_21puo1puolusyjups.R.inc(80197);JSONPath.eval(obj, "$.size()");
        } catch (JSONPathException ex) {
            __CLR4_5_21puo1puolusyjups.R.inc(80198);error = ex;
        }
        __CLR4_5_21puo1puolusyjups.R.inc(80199);Assert.assertNotNull(error);
        __CLR4_5_21puo1puolusyjups.R.inc(80200);Assert.assertNotNull(error.getCause());
    }finally{__CLR4_5_21puo1puolusyjups.R.flushNeeded();}}

    public static class ErrorSizeBean {

        public int getId() {try{__CLR4_5_21puo1puolusyjups.R.inc(80201);
            __CLR4_5_21puo1puolusyjups.R.inc(80202);throw new IllegalStateException();
        }finally{__CLR4_5_21puo1puolusyjups.R.flushNeeded();}}
    }
}
