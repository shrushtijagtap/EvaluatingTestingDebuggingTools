/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONPathException;
import com.alibaba.json.bvt.path.JSONPath_between_int.Entity;

import junit.framework.TestCase;

public class JSONPath_size extends TestCase {static class __CLR4_5_21qsw1qswlusvnfte{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,81435,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_root() throws Exception {__CLR4_5_21qsw1qswlusvnfte.R.globalSliceStart(getClass().getName(),81392);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2q9nvvu1qsw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qsw1qswlusvnfte.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qsw1qswlusvnfte.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_root",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81392,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2q9nvvu1qsw() throws Exception{try{__CLR4_5_21qsw1qswlusvnfte.R.inc(81392);
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81393);List list = new ArrayList();
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81394);list.add(new Entity(101, "kiki"));
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81395);list.add(new Entity(102, "ljw2083"));
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81396);list.add(new Entity(103, "ljw2083"));

        __CLR4_5_21qsw1qswlusvnfte.R.inc(81397);Assert.assertEquals(3, JSONPath.size(list, "$"));
    }finally{__CLR4_5_21qsw1qswlusvnfte.R.flushNeeded();}}

    public void test_path() throws Exception {__CLR4_5_21qsw1qswlusvnfte.R.globalSliceStart(getClass().getName(),81398);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2wh3d151qt2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qsw1qswlusvnfte.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qsw1qswlusvnfte.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81398,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2wh3d151qt2() throws Exception{try{__CLR4_5_21qsw1qswlusvnfte.R.inc(81398);
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81399);List list = new ArrayList();
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81400);list.add(new Entity(101, "kiki"));
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81401);list.add(new Entity(102, "ljw2083"));
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81402);list.add(new Entity(103, "ljw2083"));

        __CLR4_5_21qsw1qswlusvnfte.R.inc(81403);JSONObject root = new JSONObject();
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81404);root.put("values", list);

        __CLR4_5_21qsw1qswlusvnfte.R.inc(81405);Assert.assertEquals(3, JSONPath.size(root, "$.values"));
    }finally{__CLR4_5_21qsw1qswlusvnfte.R.flushNeeded();}}

    public void test_path_size() throws Exception {__CLR4_5_21qsw1qswlusvnfte.R.globalSliceStart(getClass().getName(),81406);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2cbj28b1qta();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qsw1qswlusvnfte.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qsw1qswlusvnfte.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81406,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2cbj28b1qta() throws Exception{try{__CLR4_5_21qsw1qswlusvnfte.R.inc(81406);
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81407);JSONPath path = JSONPath.compile("$");

        __CLR4_5_21qsw1qswlusvnfte.R.inc(81408);Assert.assertEquals(-1, path.size(null));
    }finally{__CLR4_5_21qsw1qswlusvnfte.R.flushNeeded();}}

    public void test_path_size_1() throws Exception {__CLR4_5_21qsw1qswlusvnfte.R.globalSliceStart(getClass().getName(),81409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2qkqwh31qtd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qsw1qswlusvnfte.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qsw1qswlusvnfte.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81409,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2qkqwh31qtd() throws Exception{try{__CLR4_5_21qsw1qswlusvnfte.R.inc(81409);
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81410);List list = new ArrayList();
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81411);list.add(new Entity(101, "kiki"));
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81412);list.add(new Entity(102, "ljw2083"));
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81413);list.add(new Entity(103, "ljw2083"));

        __CLR4_5_21qsw1qswlusvnfte.R.inc(81414);JSONPath path = JSONPath.compile("$");

        __CLR4_5_21qsw1qswlusvnfte.R.inc(81415);Assert.assertEquals(3, path.size(list));
    }finally{__CLR4_5_21qsw1qswlusvnfte.R.flushNeeded();}}

    public void test_path_size_2() throws Exception {__CLR4_5_21qsw1qswlusvnfte.R.globalSliceStart(getClass().getName(),81416);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2ttqv9k1qtk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qsw1qswlusvnfte.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qsw1qswlusvnfte.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81416,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2ttqv9k1qtk() throws Exception{try{__CLR4_5_21qsw1qswlusvnfte.R.inc(81416);
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81417);List list = new ArrayList();
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81418);list.add(new Entity(101, "kiki"));
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81419);list.add(new Entity(102, "ljw2083"));
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81420);list.add(new Entity(103, "ljw2083"));

        __CLR4_5_21qsw1qswlusvnfte.R.inc(81421);JSONObject root = new JSONObject();
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81422);root.put("values", list);

        __CLR4_5_21qsw1qswlusvnfte.R.inc(81423);JSONPath path = JSONPath.compile("$.values");

        __CLR4_5_21qsw1qswlusvnfte.R.inc(81424);Assert.assertEquals(3, path.size(root));
    }finally{__CLR4_5_21qsw1qswlusvnfte.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21qsw1qswlusvnfte.R.globalSliceStart(getClass().getName(),81425);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1qtt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21qsw1qswlusvnfte.R.rethrow($CLV_t2$);}finally{__CLR4_5_21qsw1qswlusvnfte.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),81425,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1qtt() throws Exception{try{__CLR4_5_21qsw1qswlusvnfte.R.inc(81425);
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81426);ErrorSizeBean obj = new ErrorSizeBean();

        __CLR4_5_21qsw1qswlusvnfte.R.inc(81427);Exception error = null;
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81428);try {
            __CLR4_5_21qsw1qswlusvnfte.R.inc(81429);JSONPath.eval(obj, "$.size()");
        } catch (JSONPathException ex) {
            __CLR4_5_21qsw1qswlusvnfte.R.inc(81430);error = ex;
        }
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81431);Assert.assertNotNull(error);
        __CLR4_5_21qsw1qswlusvnfte.R.inc(81432);Assert.assertNotNull(error.getCause());
    }finally{__CLR4_5_21qsw1qswlusvnfte.R.flushNeeded();}}

    public static class ErrorSizeBean {

        public int getId() {try{__CLR4_5_21qsw1qswlusvnfte.R.inc(81433);
            __CLR4_5_21qsw1qswlusvnfte.R.inc(81434);throw new IllegalStateException();
        }finally{__CLR4_5_21qsw1qswlusvnfte.R.flushNeeded();}}
    }
}
