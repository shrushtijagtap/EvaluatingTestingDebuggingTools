/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.kotlin;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import junit.framework.TestCase;
import org.apache.commons.io.IOUtils;

import java.io.IOException;
import java.io.InputStream;

public class Issue_for_kotlin_20181203 extends TestCase {static class __CLR4_5_21ent1entlusyjtgp{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,65673,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_user() throws Exception {__CLR4_5_21ent1entlusyjtgp.R.globalSliceStart(getClass().getName(),65657);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v7yl5r1ent();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21ent1entlusyjtgp.R.rethrow($CLV_t2$);}finally{__CLR4_5_21ent1entlusyjtgp.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.kotlin.Issue_for_kotlin_20181203.test_user",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),65657,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v7yl5r1ent() throws Exception{try{__CLR4_5_21ent1entlusyjtgp.R.inc(65657);
        __CLR4_5_21ent1entlusyjtgp.R.inc(65658);ExtClassLoader classLoader = new ExtClassLoader();
        __CLR4_5_21ent1entlusyjtgp.R.inc(65659);Class clazz = classLoader.loadClass("com.autonavi.falcon.data.service.vulpeData.ProjectItemCheckItemRelation1");

        __CLR4_5_21ent1entlusyjtgp.R.inc(65660);String str = "    [{\n"
                + "        \"project_item\": \"1105067\",\n"
                + "        \"project_name\": \"\u660e\u660e\u60f3\",\n"
                + "        \"product_id_3\": \"0210202\",\n"
                + "        \"task_type_name\": \"\u9ece\u660eX\",\n"
                + "        \"product_id_2\": \"02102\",\n"
                + "        \"product_id_1\": \"021\",\n"
                + "        \"job_item_type\": \"\u9ad8\u4e2d\",\n"
                + "        \"product_name_1\": \"\u7280\u5229\",\n"
                + "        \"product_name_2\": \"\u57fa\u7840\u8def\u7f51\",\n"
                + "        \"unit\": \"\u6761\",\n"
                + "        \"product_name_3\": \"\u5230\u5e95\",\n"
                + "        \"unitremark\": \"\u4efb\u52a1\u6761\u6570\",\n"
                + "        \"task_type\": \"57205\"\n"
                + "    }]";

        __CLR4_5_21ent1entlusyjtgp.R.inc(65661);System.out.println(JSON.VERSION);

        __CLR4_5_21ent1entlusyjtgp.R.inc(65662);Object obj = JSONArray.parseArray(str, clazz);
        __CLR4_5_21ent1entlusyjtgp.R.inc(65663);String result = JSON.toJSONString(obj);
        __CLR4_5_21ent1entlusyjtgp.R.inc(65664);System.out.println(result);
        __CLR4_5_21ent1entlusyjtgp.R.inc(65665);assertEquals("[{\"job_item_type\":\"\u9ad8\u4e2d\",\"product_id_1\":\"021\",\"product_id_2\":\"02102\",\"product_id_3\":\"0210202\",\"product_name_1\":\"\u7280\u5229\",\"product_name_2\":\"\u57fa\u7840\u8def\u7f51\",\"product_name_3\":\"\u5230\u5e95\",\"project_item\":\"1105067\",\"project_name\":\"\u660e\u660e\u60f3\",\"task_type\":\"57205\",\"task_type_name\":\"\u9ece\u660eX\",\"unit\":\"\u6761\",\"unitremark\":\"\u4efb\u52a1\u6761\u6570\"}]", result);
    }finally{__CLR4_5_21ent1entlusyjtgp.R.flushNeeded();}}

    private static class ExtClassLoader extends ClassLoader {

        public ExtClassLoader() throws IOException {
            super(Thread.currentThread().getContextClassLoader());__CLR4_5_21ent1entlusyjtgp.R.inc(65667);try{__CLR4_5_21ent1entlusyjtgp.R.inc(65666);

            {
                __CLR4_5_21ent1entlusyjtgp.R.inc(65668);byte[] bytes;
                __CLR4_5_21ent1entlusyjtgp.R.inc(65669);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("kotlin/ProjectItemCheckItemRelation1.clazz");
                __CLR4_5_21ent1entlusyjtgp.R.inc(65670);bytes = IOUtils.toByteArray(is);
                __CLR4_5_21ent1entlusyjtgp.R.inc(65671);is.close();

                __CLR4_5_21ent1entlusyjtgp.R.inc(65672);super.defineClass("com.autonavi.falcon.data.service.vulpeData.ProjectItemCheckItemRelation1", bytes, 0, bytes.length);
            }
        }finally{__CLR4_5_21ent1entlusyjtgp.R.flushNeeded();}}
    }
}
