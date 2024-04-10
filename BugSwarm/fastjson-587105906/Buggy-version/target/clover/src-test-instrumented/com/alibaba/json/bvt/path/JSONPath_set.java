/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;
import com.alibaba.fastjson.JSONPathException;

import junit.framework.TestCase;

public class JSONPath_set extends TestCase {static class __CLR4_1_101qrd1qrdluszweo1{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,81369,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_set() throws Exception {__CLR4_1_101qrd1qrdluszweo1.R.globalSliceStart(getClass().getName(),81337);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xan8ro1qrd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qrd1qrdluszweo1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qrd1qrdluszweo1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_set",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81337,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xan8ro1qrd() throws Exception{try{__CLR4_1_101qrd1qrdluszweo1.R.inc(81337);
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81338);Entity entity = new Entity();

        __CLR4_1_101qrd1qrdluszweo1.R.inc(81339);JSONPath.set(entity, "$.name", "abc");

        __CLR4_1_101qrd1qrdluszweo1.R.inc(81340);Assert.assertEquals("abc", entity.getName());
    }finally{__CLR4_1_101qrd1qrdluszweo1.R.flushNeeded();}}

    public void test_set_array() throws Exception {__CLR4_1_101qrd1qrdluszweo1.R.globalSliceStart(getClass().getName(),81341);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g2ks7e1qrh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qrd1qrdluszweo1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qrd1qrdluszweo1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_set_array",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81341,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g2ks7e1qrh() throws Exception{try{__CLR4_1_101qrd1qrdluszweo1.R.inc(81341);
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81342);Object[] array = new Object[1];

        __CLR4_1_101qrd1qrdluszweo1.R.inc(81343);JSONPath.set(array, "[0]", "abc");

        __CLR4_1_101qrd1qrdluszweo1.R.inc(81344);Assert.assertEquals("abc", array[0]);
    }finally{__CLR4_1_101qrd1qrdluszweo1.R.flushNeeded();}}

    public void test_set_list() throws Exception {__CLR4_1_101qrd1qrdluszweo1.R.globalSliceStart(getClass().getName(),81345);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103dwyfl1qrl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qrd1qrdluszweo1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qrd1qrdluszweo1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_set_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81345,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103dwyfl1qrl() throws Exception{try{__CLR4_1_101qrd1qrdluszweo1.R.inc(81345);
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81346);List array = new ArrayList();
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81347);array.add(null);
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81348);array.add(null);

        __CLR4_1_101qrd1qrdluszweo1.R.inc(81349);JSONPath.set(array, "[0]", "abc");

        __CLR4_1_101qrd1qrdluszweo1.R.inc(81350);Assert.assertEquals("abc", array.get(0));
    }finally{__CLR4_1_101qrd1qrdluszweo1.R.flushNeeded();}}

    public void test_root_null() throws Exception {__CLR4_1_101qrd1qrdluszweo1.R.globalSliceStart(getClass().getName(),81351);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10bswbwi1qrr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qrd1qrdluszweo1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qrd1qrdluszweo1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_root_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81351,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10bswbwi1qrr() throws Exception{try{__CLR4_1_101qrd1qrdluszweo1.R.inc(81351);
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81352);Assert.assertFalse(JSONPath.set(null, "[0]", "abc"));
    }finally{__CLR4_1_101qrd1qrdluszweo1.R.flushNeeded();}}
    
    public void test_object_not_exits() throws Exception {__CLR4_1_101qrd1qrdluszweo1.R.globalSliceStart(getClass().getName(),81353);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i4mitf1qrt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qrd1qrdluszweo1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qrd1qrdluszweo1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_object_not_exits",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81353,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i4mitf1qrt() throws Exception{try{__CLR4_1_101qrd1qrdluszweo1.R.inc(81353);
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81354);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81355);root.put("values", null);
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81356);Assert.assertTrue(JSONPath.set(root, "$.values[0]", "abc"));
    }finally{__CLR4_1_101qrd1qrdluszweo1.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101qrd1qrdluszweo1.R.globalSliceStart(getClass().getName(),81357);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1qrx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qrd1qrdluszweo1.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qrd1qrdluszweo1.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_set.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81357,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1qrx() throws Exception{try{__CLR4_1_101qrd1qrdluszweo1.R.inc(81357);
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81358);Map<String, Object> root = new HashMap<String, Object>();
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81359);root.put("values", null);
        __CLR4_1_101qrd1qrdluszweo1.R.inc(81360);JSONPath.set(root, "$.values[0]", "abc");
    }finally{__CLR4_1_101qrd1qrdluszweo1.R.flushNeeded();}}

    static class Entity {

        private Integer id;
        private String  name;

        public Integer getId() {try{__CLR4_1_101qrd1qrdluszweo1.R.inc(81361);
            __CLR4_1_101qrd1qrdluszweo1.R.inc(81362);return id;
        }finally{__CLR4_1_101qrd1qrdluszweo1.R.flushNeeded();}}

        public void setId(Integer id) {try{__CLR4_1_101qrd1qrdluszweo1.R.inc(81363);
            __CLR4_1_101qrd1qrdluszweo1.R.inc(81364);this.id = id;
        }finally{__CLR4_1_101qrd1qrdluszweo1.R.flushNeeded();}}

        public String getName() {try{__CLR4_1_101qrd1qrdluszweo1.R.inc(81365);
            __CLR4_1_101qrd1qrdluszweo1.R.inc(81366);return name;
        }finally{__CLR4_1_101qrd1qrdluszweo1.R.flushNeeded();}}

        public void setName(String name) {try{__CLR4_1_101qrd1qrdluszweo1.R.inc(81367);
            __CLR4_1_101qrd1qrdluszweo1.R.inc(81368);this.name = name;
        }finally{__CLR4_1_101qrd1qrdluszweo1.R.flushNeeded();}}

    }
}
