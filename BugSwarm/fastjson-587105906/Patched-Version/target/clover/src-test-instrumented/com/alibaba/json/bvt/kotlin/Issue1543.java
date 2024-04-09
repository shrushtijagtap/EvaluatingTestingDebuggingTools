/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.kotlin;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Issue1543 extends TestCase {static class __CLR4_5_21fk91fk9lusvnc5u{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,66849,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_user() throws Exception {__CLR4_5_21fk91fk9lusvnc5u.R.globalSliceStart(getClass().getName(),66825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v7yl5r1fk9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fk91fk9lusvnc5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fk91fk9lusvnc5u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.kotlin.Issue1543.test_user",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v7yl5r1fk9() throws Exception{try{__CLR4_5_21fk91fk9lusvnc5u.R.inc(66825);
        __CLR4_5_21fk91fk9lusvnc5u.R.inc(66826);ExtClassLoader classLoader = new ExtClassLoader();
        __CLR4_5_21fk91fk9lusvnc5u.R.inc(66827);Class clazzUser = classLoader.loadClass("User1");

        __CLR4_5_21fk91fk9lusvnc5u.R.inc(66828);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_5_21fk91fk9lusvnc5u.R.inc(66829);map.put("id", 1);
        __CLR4_5_21fk91fk9lusvnc5u.R.inc(66830);map.put("name", "test1");

        __CLR4_5_21fk91fk9lusvnc5u.R.inc(66831);JSON.parseObject(JSON.toJSONString(map), clazzUser);
    }finally{__CLR4_5_21fk91fk9lusvnc5u.R.flushNeeded();}}

    public void test_cluster() throws Exception {__CLR4_5_21fk91fk9lusvnc5u.R.globalSliceStart(getClass().getName(),66832);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2chzgfo1fkg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21fk91fk9lusvnc5u.R.rethrow($CLV_t2$);}finally{__CLR4_5_21fk91fk9lusvnc5u.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.kotlin.Issue1543.test_cluster",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),66832,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2chzgfo1fkg() throws Exception{try{__CLR4_5_21fk91fk9lusvnc5u.R.inc(66832);
        __CLR4_5_21fk91fk9lusvnc5u.R.inc(66833);ExtClassLoader classLoader = new ExtClassLoader();
        __CLR4_5_21fk91fk9lusvnc5u.R.inc(66834);Class clazzCluster = classLoader.loadClass("Cluster");

        __CLR4_5_21fk91fk9lusvnc5u.R.inc(66835);Object cluster = JSON.parseObject(JSON.toJSONString(Collections.singletonMap("cluster_enabled", 1)), clazzCluster);
        __CLR4_5_21fk91fk9lusvnc5u.R.inc(66836);assertEquals("{\"cluster_enabled\":1}", JSON.toJSONString(cluster));
    }finally{__CLR4_5_21fk91fk9lusvnc5u.R.flushNeeded();}}

    public static class ExtClassLoader extends ClassLoader {

        public ExtClassLoader() throws IOException {
            super(Thread.currentThread().getContextClassLoader());__CLR4_5_21fk91fk9lusvnc5u.R.inc(66838);try{__CLR4_5_21fk91fk9lusvnc5u.R.inc(66837);

            {
                __CLR4_5_21fk91fk9lusvnc5u.R.inc(66839);byte[] bytes;
                __CLR4_5_21fk91fk9lusvnc5u.R.inc(66840);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("kotlin/issue1543/User1.clazz");
                __CLR4_5_21fk91fk9lusvnc5u.R.inc(66841);bytes = IOUtils.toByteArray(is);
                __CLR4_5_21fk91fk9lusvnc5u.R.inc(66842);is.close();

                __CLR4_5_21fk91fk9lusvnc5u.R.inc(66843);super.defineClass("User1", bytes, 0, bytes.length);
            }

            {
                __CLR4_5_21fk91fk9lusvnc5u.R.inc(66844);byte[] bytes;
                __CLR4_5_21fk91fk9lusvnc5u.R.inc(66845);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("kotlin/issue1543/Cluster.clazz");
                __CLR4_5_21fk91fk9lusvnc5u.R.inc(66846);bytes = IOUtils.toByteArray(is);
                __CLR4_5_21fk91fk9lusvnc5u.R.inc(66847);is.close();

                __CLR4_5_21fk91fk9lusvnc5u.R.inc(66848);super.defineClass("Cluster", bytes, 0, bytes.length);
            }
        }finally{__CLR4_5_21fk91fk9lusvnc5u.R.flushNeeded();}}
    }
}
