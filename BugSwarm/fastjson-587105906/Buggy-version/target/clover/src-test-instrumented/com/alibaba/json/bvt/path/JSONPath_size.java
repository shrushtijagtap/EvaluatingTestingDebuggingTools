/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONPathException;
import com.alibaba.json.bvt.path.JSONPath_between_int.Entity;

import junit.framework.TestCase;

public class JSONPath_size extends TestCase {static class __CLR4_1_101qt71qt7luszweos{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,81446,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_root() throws Exception {__CLR4_1_101qt71qt7luszweos.R.globalSliceStart(getClass().getName(),81403);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10q9nvvu1qt7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qt71qt7luszweos.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qt71qt7luszweos.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_root",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81403,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10q9nvvu1qt7() throws Exception{try{__CLR4_1_101qt71qt7luszweos.R.inc(81403);
        __CLR4_1_101qt71qt7luszweos.R.inc(81404);List list = new ArrayList();
        __CLR4_1_101qt71qt7luszweos.R.inc(81405);list.add(new Entity(101, "kiki"));
        __CLR4_1_101qt71qt7luszweos.R.inc(81406);list.add(new Entity(102, "ljw2083"));
        __CLR4_1_101qt71qt7luszweos.R.inc(81407);list.add(new Entity(103, "ljw2083"));

        __CLR4_1_101qt71qt7luszweos.R.inc(81408);Assert.assertEquals(3, JSONPath.size(list, "$"));
    }finally{__CLR4_1_101qt71qt7luszweos.R.flushNeeded();}}

    public void test_path() throws Exception {__CLR4_1_101qt71qt7luszweos.R.globalSliceStart(getClass().getName(),81409);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10wh3d151qtd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qt71qt7luszweos.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qt71qt7luszweos.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81409,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10wh3d151qtd() throws Exception{try{__CLR4_1_101qt71qt7luszweos.R.inc(81409);
        __CLR4_1_101qt71qt7luszweos.R.inc(81410);List list = new ArrayList();
        __CLR4_1_101qt71qt7luszweos.R.inc(81411);list.add(new Entity(101, "kiki"));
        __CLR4_1_101qt71qt7luszweos.R.inc(81412);list.add(new Entity(102, "ljw2083"));
        __CLR4_1_101qt71qt7luszweos.R.inc(81413);list.add(new Entity(103, "ljw2083"));

        __CLR4_1_101qt71qt7luszweos.R.inc(81414);JSONObject root = new JSONObject();
        __CLR4_1_101qt71qt7luszweos.R.inc(81415);root.put("values", list);

        __CLR4_1_101qt71qt7luszweos.R.inc(81416);Assert.assertEquals(3, JSONPath.size(root, "$.values"));
    }finally{__CLR4_1_101qt71qt7luszweos.R.flushNeeded();}}

    public void test_path_size() throws Exception {__CLR4_1_101qt71qt7luszweos.R.globalSliceStart(getClass().getName(),81417);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10cbj28b1qtl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qt71qt7luszweos.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qt71qt7luszweos.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81417,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10cbj28b1qtl() throws Exception{try{__CLR4_1_101qt71qt7luszweos.R.inc(81417);
        __CLR4_1_101qt71qt7luszweos.R.inc(81418);JSONPath path = JSONPath.compile("$");

        __CLR4_1_101qt71qt7luszweos.R.inc(81419);Assert.assertEquals(-1, path.size(null));
    }finally{__CLR4_1_101qt71qt7luszweos.R.flushNeeded();}}

    public void test_path_size_1() throws Exception {__CLR4_1_101qt71qt7luszweos.R.globalSliceStart(getClass().getName(),81420);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qkqwh31qto();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qt71qt7luszweos.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qt71qt7luszweos.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81420,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qkqwh31qto() throws Exception{try{__CLR4_1_101qt71qt7luszweos.R.inc(81420);
        __CLR4_1_101qt71qt7luszweos.R.inc(81421);List list = new ArrayList();
        __CLR4_1_101qt71qt7luszweos.R.inc(81422);list.add(new Entity(101, "kiki"));
        __CLR4_1_101qt71qt7luszweos.R.inc(81423);list.add(new Entity(102, "ljw2083"));
        __CLR4_1_101qt71qt7luszweos.R.inc(81424);list.add(new Entity(103, "ljw2083"));

        __CLR4_1_101qt71qt7luszweos.R.inc(81425);JSONPath path = JSONPath.compile("$");

        __CLR4_1_101qt71qt7luszweos.R.inc(81426);Assert.assertEquals(3, path.size(list));
    }finally{__CLR4_1_101qt71qt7luszweos.R.flushNeeded();}}

    public void test_path_size_2() throws Exception {__CLR4_1_101qt71qt7luszweos.R.globalSliceStart(getClass().getName(),81427);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10ttqv9k1qtv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qt71qt7luszweos.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qt71qt7luszweos.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_path_size_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81427,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10ttqv9k1qtv() throws Exception{try{__CLR4_1_101qt71qt7luszweos.R.inc(81427);
        __CLR4_1_101qt71qt7luszweos.R.inc(81428);List list = new ArrayList();
        __CLR4_1_101qt71qt7luszweos.R.inc(81429);list.add(new Entity(101, "kiki"));
        __CLR4_1_101qt71qt7luszweos.R.inc(81430);list.add(new Entity(102, "ljw2083"));
        __CLR4_1_101qt71qt7luszweos.R.inc(81431);list.add(new Entity(103, "ljw2083"));

        __CLR4_1_101qt71qt7luszweos.R.inc(81432);JSONObject root = new JSONObject();
        __CLR4_1_101qt71qt7luszweos.R.inc(81433);root.put("values", list);

        __CLR4_1_101qt71qt7luszweos.R.inc(81434);JSONPath path = JSONPath.compile("$.values");

        __CLR4_1_101qt71qt7luszweos.R.inc(81435);Assert.assertEquals(3, path.size(root));
    }finally{__CLR4_1_101qt71qt7luszweos.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101qt71qt7luszweos.R.globalSliceStart(getClass().getName(),81436);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1qu4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qt71qt7luszweos.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qt71qt7luszweos.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_size.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81436,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1qu4() throws Exception{try{__CLR4_1_101qt71qt7luszweos.R.inc(81436);
        __CLR4_1_101qt71qt7luszweos.R.inc(81437);ErrorSizeBean obj = new ErrorSizeBean();

        __CLR4_1_101qt71qt7luszweos.R.inc(81438);Exception error = null;
        __CLR4_1_101qt71qt7luszweos.R.inc(81439);try {
            __CLR4_1_101qt71qt7luszweos.R.inc(81440);JSONPath.eval(obj, "$.size()");
        } catch (JSONPathException ex) {
            __CLR4_1_101qt71qt7luszweos.R.inc(81441);error = ex;
        }
        __CLR4_1_101qt71qt7luszweos.R.inc(81442);Assert.assertNotNull(error);
        __CLR4_1_101qt71qt7luszweos.R.inc(81443);Assert.assertNotNull(error.getCause());
    }finally{__CLR4_1_101qt71qt7luszweos.R.flushNeeded();}}

    public static class ErrorSizeBean {

        public int getId() {try{__CLR4_1_101qt71qt7luszweos.R.inc(81444);
            __CLR4_1_101qt71qt7luszweos.R.inc(81445);throw new IllegalStateException();
        }finally{__CLR4_1_101qt71qt7luszweos.R.flushNeeded();}}
    }
}
