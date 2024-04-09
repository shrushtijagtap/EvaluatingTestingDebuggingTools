/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONPathException;
import com.alibaba.json.bvt.path.JSONPath_between_int.Entity;

import junit.framework.TestCase;

public class JSONPath_size extends TestCase {static class __CLR4_1_101puz1puzlusqkivy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,80214,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_root() throws Exception {__CLR4_1_101puz1puzlusqkivy.R.globalSliceStart(getClass().getName(),80171);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10q9nvvu1puz();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101puz1puzlusqkivy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101puz1puzlusqkivy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_root",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80171,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10q9nvvu1puz() throws Exception{try{__CLR4_1_101puz1puzlusqkivy.R.inc(80171);
        __CLR4_1_101puz1puzlusqkivy.R.inc(80172);List list = new ArrayList();
        __CLR4_1_101puz1puzlusqkivy.R.inc(80173);list.add(new Entity(101, "kiki"));
        __CLR4_1_101puz1puzlusqkivy.R.inc(80174);list.add(new Entity(102, "ljw2083"));
        __CLR4_1_101puz1puzlusqkivy.R.inc(80175);list.add(new Entity(103, "ljw2083"));

        __CLR4_1_101puz1puzlusqkivy.R.inc(80176);Assert.assertEquals(3, JSONPath.size(list, "$"));
    }finally{__CLR4_1_101puz1puzlusqkivy.R.flushNeeded();}}

    public void test_path() throws Exception {__CLR4_1_101puz1puzlusqkivy.R.globalSliceStart(getClass().getName(),80177);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wh3d151pv5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101puz1puzlusqkivy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101puz1puzlusqkivy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80177,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wh3d151pv5() throws Exception{try{__CLR4_1_101puz1puzlusqkivy.R.inc(80177);
        __CLR4_1_101puz1puzlusqkivy.R.inc(80178);List list = new ArrayList();
        __CLR4_1_101puz1puzlusqkivy.R.inc(80179);list.add(new Entity(101, "kiki"));
        __CLR4_1_101puz1puzlusqkivy.R.inc(80180);list.add(new Entity(102, "ljw2083"));
        __CLR4_1_101puz1puzlusqkivy.R.inc(80181);list.add(new Entity(103, "ljw2083"));

        __CLR4_1_101puz1puzlusqkivy.R.inc(80182);JSONObject root = new JSONObject();
        __CLR4_1_101puz1puzlusqkivy.R.inc(80183);root.put("values", list);

        __CLR4_1_101puz1puzlusqkivy.R.inc(80184);Assert.assertEquals(3, JSONPath.size(root, "$.values"));
    }finally{__CLR4_1_101puz1puzlusqkivy.R.flushNeeded();}}

    public void test_path_size() throws Exception {__CLR4_1_101puz1puzlusqkivy.R.globalSliceStart(getClass().getName(),80185);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cbj28b1pvd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101puz1puzlusqkivy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101puz1puzlusqkivy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80185,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cbj28b1pvd() throws Exception{try{__CLR4_1_101puz1puzlusqkivy.R.inc(80185);
        __CLR4_1_101puz1puzlusqkivy.R.inc(80186);JSONPath path = JSONPath.compile("$");

        __CLR4_1_101puz1puzlusqkivy.R.inc(80187);Assert.assertEquals(-1, path.size(null));
    }finally{__CLR4_1_101puz1puzlusqkivy.R.flushNeeded();}}

    public void test_path_size_1() throws Exception {__CLR4_1_101puz1puzlusqkivy.R.globalSliceStart(getClass().getName(),80188);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qkqwh31pvg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101puz1puzlusqkivy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101puz1puzlusqkivy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80188,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qkqwh31pvg() throws Exception{try{__CLR4_1_101puz1puzlusqkivy.R.inc(80188);
        __CLR4_1_101puz1puzlusqkivy.R.inc(80189);List list = new ArrayList();
        __CLR4_1_101puz1puzlusqkivy.R.inc(80190);list.add(new Entity(101, "kiki"));
        __CLR4_1_101puz1puzlusqkivy.R.inc(80191);list.add(new Entity(102, "ljw2083"));
        __CLR4_1_101puz1puzlusqkivy.R.inc(80192);list.add(new Entity(103, "ljw2083"));

        __CLR4_1_101puz1puzlusqkivy.R.inc(80193);JSONPath path = JSONPath.compile("$");

        __CLR4_1_101puz1puzlusqkivy.R.inc(80194);Assert.assertEquals(3, path.size(list));
    }finally{__CLR4_1_101puz1puzlusqkivy.R.flushNeeded();}}

    public void test_path_size_2() throws Exception {__CLR4_1_101puz1puzlusqkivy.R.globalSliceStart(getClass().getName(),80195);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ttqv9k1pvn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101puz1puzlusqkivy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101puz1puzlusqkivy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80195,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ttqv9k1pvn() throws Exception{try{__CLR4_1_101puz1puzlusqkivy.R.inc(80195);
        __CLR4_1_101puz1puzlusqkivy.R.inc(80196);List list = new ArrayList();
        __CLR4_1_101puz1puzlusqkivy.R.inc(80197);list.add(new Entity(101, "kiki"));
        __CLR4_1_101puz1puzlusqkivy.R.inc(80198);list.add(new Entity(102, "ljw2083"));
        __CLR4_1_101puz1puzlusqkivy.R.inc(80199);list.add(new Entity(103, "ljw2083"));

        __CLR4_1_101puz1puzlusqkivy.R.inc(80200);JSONObject root = new JSONObject();
        __CLR4_1_101puz1puzlusqkivy.R.inc(80201);root.put("values", list);

        __CLR4_1_101puz1puzlusqkivy.R.inc(80202);JSONPath path = JSONPath.compile("$.values");

        __CLR4_1_101puz1puzlusqkivy.R.inc(80203);Assert.assertEquals(3, path.size(root));
    }finally{__CLR4_1_101puz1puzlusqkivy.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101puz1puzlusqkivy.R.globalSliceStart(getClass().getName(),80204);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1pvw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101puz1puzlusqkivy.R.rethrow($CLV_t2$);}finally{__CLR4_1_101puz1puzlusqkivy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80204,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1pvw() throws Exception{try{__CLR4_1_101puz1puzlusqkivy.R.inc(80204);
        __CLR4_1_101puz1puzlusqkivy.R.inc(80205);ErrorSizeBean obj = new ErrorSizeBean();

        __CLR4_1_101puz1puzlusqkivy.R.inc(80206);Exception error = null;
        __CLR4_1_101puz1puzlusqkivy.R.inc(80207);try {
            __CLR4_1_101puz1puzlusqkivy.R.inc(80208);JSONPath.eval(obj, "$.size()");
        } catch (JSONPathException ex) {
            __CLR4_1_101puz1puzlusqkivy.R.inc(80209);error = ex;
        }
        __CLR4_1_101puz1puzlusqkivy.R.inc(80210);Assert.assertNotNull(error);
        __CLR4_1_101puz1puzlusqkivy.R.inc(80211);Assert.assertNotNull(error.getCause());
    }finally{__CLR4_1_101puz1puzlusqkivy.R.flushNeeded();}}

    public static class ErrorSizeBean {

        public int getId() {try{__CLR4_1_101puz1puzlusqkivy.R.inc(80212);
            __CLR4_1_101puz1puzlusqkivy.R.inc(80213);throw new IllegalStateException();
        }finally{__CLR4_1_101puz1puzlusqkivy.R.flushNeeded();}}
    }
}
