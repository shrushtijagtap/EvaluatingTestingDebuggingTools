/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_none_root extends TestCase {static class __CLR4_1_101qnw1qnwluszwen7{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,81230,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_root() throws Exception {__CLR4_1_101qnw1qnwluszwen7.R.globalSliceStart(getClass().getName(),81212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10q9nvvu1qnw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qnw1qnwluszwen7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qnw1qnwluszwen7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_none_root.test_root",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81212,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10q9nvvu1qnw() throws Exception{try{__CLR4_1_101qnw1qnwluszwen7.R.inc(81212);
        __CLR4_1_101qnw1qnwluszwen7.R.inc(81213);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101qnw1qnwluszwen7.R.inc(81214);list.add(new Object());
        __CLR4_1_101qnw1qnwluszwen7.R.inc(81215);Assert.assertSame(list.get(0), new JSONPath("[0]").eval(list));
    }finally{__CLR4_1_101qnw1qnwluszwen7.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101qnw1qnwluszwen7.R.globalSliceStart(getClass().getName(),81216);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1qo0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qnw1qnwluszwen7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qnw1qnwluszwen7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_none_root.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81216,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1qo0() throws Exception{try{__CLR4_1_101qnw1qnwluszwen7.R.inc(81216);
        __CLR4_1_101qnw1qnwluszwen7.R.inc(81217);Assert.assertNull(new JSONPath("name").eval(null));
    }finally{__CLR4_1_101qnw1qnwluszwen7.R.flushNeeded();}}

    public void test_map() throws Exception {__CLR4_1_101qnw1qnwluszwen7.R.globalSliceStart(getClass().getName(),81218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aaqgyy1qo2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qnw1qnwluszwen7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qnw1qnwluszwen7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_none_root.test_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81218,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aaqgyy1qo2() throws Exception{try{__CLR4_1_101qnw1qnwluszwen7.R.inc(81218);
        __CLR4_1_101qnw1qnwluszwen7.R.inc(81219);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101qnw1qnwluszwen7.R.inc(81220);map.put("val", new Object());
        __CLR4_1_101qnw1qnwluszwen7.R.inc(81221);Assert.assertSame(map.get("val"), new JSONPath("val").eval(map));
    }finally{__CLR4_1_101qnw1qnwluszwen7.R.flushNeeded();}}
    
    public void test_entity() throws Exception {__CLR4_1_101qnw1qnwluszwen7.R.globalSliceStart(getClass().getName(),81222);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109qqwzt1qo6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qnw1qnwluszwen7.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qnw1qnwluszwen7.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_none_root.test_entity",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81222,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109qqwzt1qo6() throws Exception{try{__CLR4_1_101qnw1qnwluszwen7.R.inc(81222);
        __CLR4_1_101qnw1qnwluszwen7.R.inc(81223);Entity entity = new Entity();
        __CLR4_1_101qnw1qnwluszwen7.R.inc(81224);entity.setValue(new Object());
        __CLR4_1_101qnw1qnwluszwen7.R.inc(81225);Assert.assertSame(entity.getValue(), new JSONPath("value").eval(entity));
    }finally{__CLR4_1_101qnw1qnwluszwen7.R.flushNeeded();}}

    public static class Entity {

        private Object value;

        public Object getValue() {try{__CLR4_1_101qnw1qnwluszwen7.R.inc(81226);
            __CLR4_1_101qnw1qnwluszwen7.R.inc(81227);return value;
        }finally{__CLR4_1_101qnw1qnwluszwen7.R.flushNeeded();}}

        public void setValue(Object value) {try{__CLR4_1_101qnw1qnwluszwen7.R.inc(81228);
            __CLR4_1_101qnw1qnwluszwen7.R.inc(81229);this.value = value;
        }finally{__CLR4_1_101qnw1qnwluszwen7.R.flushNeeded();}}

    }
}
