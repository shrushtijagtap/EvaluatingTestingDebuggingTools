/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.path;

import java.util.HashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSONPath;

public class JSONPath_0 extends TestCase {static class __CLR4_1_101pbr1pbrluszwe60{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,79496,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_root() throws Exception {__CLR4_1_101pbr1pbrluszwe60.R.globalSliceStart(getClass().getName(),79479);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10q9nvvu1pbr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pbr1pbrluszwe60.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pbr1pbrluszwe60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_0.test_root",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79479,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10q9nvvu1pbr() throws Exception{try{__CLR4_1_101pbr1pbrluszwe60.R.inc(79479);
        __CLR4_1_101pbr1pbrluszwe60.R.inc(79480);Object obj = new Object();
        __CLR4_1_101pbr1pbrluszwe60.R.inc(79481);Assert.assertSame(obj, new JSONPath("$").eval(obj));
    }finally{__CLR4_1_101pbr1pbrluszwe60.R.flushNeeded();}}

    public void test_null() throws Exception {__CLR4_1_101pbr1pbrluszwe60.R.globalSliceStart(getClass().getName(),79482);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vkuxwl1pbu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pbr1pbrluszwe60.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pbr1pbrluszwe60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_0.test_null",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79482,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vkuxwl1pbu() throws Exception{try{__CLR4_1_101pbr1pbrluszwe60.R.inc(79482);
        __CLR4_1_101pbr1pbrluszwe60.R.inc(79483);Assert.assertNull(new JSONPath("$").extract(null));
    }finally{__CLR4_1_101pbr1pbrluszwe60.R.flushNeeded();}}

    public void test_map() throws Exception {__CLR4_1_101pbr1pbrluszwe60.R.globalSliceStart(getClass().getName(),79484);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aaqgyy1pbw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pbr1pbrluszwe60.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pbr1pbrluszwe60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_0.test_map",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79484,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aaqgyy1pbw() throws Exception{try{__CLR4_1_101pbr1pbrluszwe60.R.inc(79484);
        __CLR4_1_101pbr1pbrluszwe60.R.inc(79485);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101pbr1pbrluszwe60.R.inc(79486);map.put("val", new Object());
        __CLR4_1_101pbr1pbrluszwe60.R.inc(79487);Assert.assertSame(map.get("val"), new JSONPath("$.val").eval(map));
    }finally{__CLR4_1_101pbr1pbrluszwe60.R.flushNeeded();}}
    
    public void test_entity() throws Exception {__CLR4_1_101pbr1pbrluszwe60.R.globalSliceStart(getClass().getName(),79488);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_109qqwzt1pc0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101pbr1pbrluszwe60.R.rethrow($CLV_t2$);}finally{__CLR4_1_101pbr1pbrluszwe60.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.path.JSONPath_0.test_entity",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),79488,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_109qqwzt1pc0() throws Exception{try{__CLR4_1_101pbr1pbrluszwe60.R.inc(79488);
        __CLR4_1_101pbr1pbrluszwe60.R.inc(79489);Entity entity = new Entity();
        __CLR4_1_101pbr1pbrluszwe60.R.inc(79490);entity.setValue(new Object());
        __CLR4_1_101pbr1pbrluszwe60.R.inc(79491);Assert.assertSame(entity.getValue(), new JSONPath("$.value").eval(entity));
    }finally{__CLR4_1_101pbr1pbrluszwe60.R.flushNeeded();}}

    public static class Entity {

        private Object value;

        public Object getValue() {try{__CLR4_1_101pbr1pbrluszwe60.R.inc(79492);
            __CLR4_1_101pbr1pbrluszwe60.R.inc(79493);return value;
        }finally{__CLR4_1_101pbr1pbrluszwe60.R.flushNeeded();}}

        public void setValue(Object value) {try{__CLR4_1_101pbr1pbrluszwe60.R.inc(79494);
            __CLR4_1_101pbr1pbrluszwe60.R.inc(79495);this.value = value;
        }finally{__CLR4_1_101pbr1pbrluszwe60.R.flushNeeded();}}

    }
}
