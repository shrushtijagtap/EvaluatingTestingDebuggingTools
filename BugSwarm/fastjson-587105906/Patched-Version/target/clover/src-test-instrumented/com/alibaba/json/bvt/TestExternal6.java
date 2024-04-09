/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.HashMap;

import com.alibaba.fastjson.parser.ParserConfig;
import org.junit.Assert;
import junit.framework.TestCase;

import org.apache.commons.io.IOUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TestExternal6 extends TestCase {static class __CLR4_5_210ta10talusvn3xy{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,47742,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    ParserConfig confg = ParserConfig.global;

    protected void setUp() throws Exception {try{__CLR4_5_210ta10talusvn3xy.R.inc(47710);
        __CLR4_5_210ta10talusvn3xy.R.inc(47711);confg.addAccept("org.mule.esb.model");
    }finally{__CLR4_5_210ta10talusvn3xy.R.flushNeeded();}}

    public void test_0() throws Exception {__CLR4_5_210ta10talusvn3xy.R.globalSliceStart(getClass().getName(),47712);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp210tc();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_210ta10talusvn3xy.R.rethrow($CLV_t2$);}finally{__CLR4_5_210ta10talusvn3xy.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.TestExternal6.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),47712,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp210tc() throws Exception{try{__CLR4_5_210ta10talusvn3xy.R.inc(47712);
        __CLR4_5_210ta10talusvn3xy.R.inc(47713);ExtClassLoader classLoader = new ExtClassLoader();
        __CLR4_5_210ta10talusvn3xy.R.inc(47714);Class<?> clazz = classLoader.loadClass("org.mule.esb.model.tcc.result.EsbResultModel");
        __CLR4_5_210ta10talusvn3xy.R.inc(47715);Method[] methods = clazz.getMethods();
        __CLR4_5_210ta10talusvn3xy.R.inc(47716);Method method = clazz.getMethod("setReturnValue", new Class[] { Serializable.class });

        __CLR4_5_210ta10talusvn3xy.R.inc(47717);Object obj = clazz.newInstance();
//        method.invoke(obj, "AAAA");

        {
            __CLR4_5_210ta10talusvn3xy.R.inc(47718);String text = JSON.toJSONString(obj);
            __CLR4_5_210ta10talusvn3xy.R.inc(47719);System.out.println(text);
        }

        __CLR4_5_210ta10talusvn3xy.R.inc(47720);String text = JSON.toJSONString(obj, SerializerFeature.WriteClassName, SerializerFeature.WriteMapNullValue);
        __CLR4_5_210ta10talusvn3xy.R.inc(47721);System.out.println(text);
        __CLR4_5_210ta10talusvn3xy.R.inc(47722);JSON.parseObject(text, clazz, confg);
        __CLR4_5_210ta10talusvn3xy.R.inc(47723);String clazzName = JSON.parse(text, confg).getClass().getName();
        __CLR4_5_210ta10talusvn3xy.R.inc(47724);Assert.assertEquals(clazz.getName(), clazzName);
    }finally{__CLR4_5_210ta10talusvn3xy.R.flushNeeded();}}

    public static class ExtClassLoader extends ClassLoader {

        public ExtClassLoader() throws IOException{
            super(Thread.currentThread().getContextClassLoader());__CLR4_5_210ta10talusvn3xy.R.inc(47726);try{__CLR4_5_210ta10talusvn3xy.R.inc(47725);

            {
                __CLR4_5_210ta10talusvn3xy.R.inc(47727);byte[] bytes;
                __CLR4_5_210ta10talusvn3xy.R.inc(47728);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("external/EsbResultModel.clazz");
                __CLR4_5_210ta10talusvn3xy.R.inc(47729);bytes = IOUtils.toByteArray(is);
                __CLR4_5_210ta10talusvn3xy.R.inc(47730);is.close();

                __CLR4_5_210ta10talusvn3xy.R.inc(47731);super.defineClass("org.mule.esb.model.tcc.result.EsbResultModel", bytes, 0, bytes.length);
            }
            {
                __CLR4_5_210ta10talusvn3xy.R.inc(47732);byte[] bytes;
                __CLR4_5_210ta10talusvn3xy.R.inc(47733);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("external/EsbListBean.clazz");
                __CLR4_5_210ta10talusvn3xy.R.inc(47734);bytes = IOUtils.toByteArray(is);
                __CLR4_5_210ta10talusvn3xy.R.inc(47735);is.close();
                
                __CLR4_5_210ta10talusvn3xy.R.inc(47736);super.defineClass("org.esb.crm.tools.EsbListBean", bytes, 0, bytes.length);
            }
            {
                __CLR4_5_210ta10talusvn3xy.R.inc(47737);byte[] bytes;
                __CLR4_5_210ta10talusvn3xy.R.inc(47738);InputStream is = Thread.currentThread().getContextClassLoader().getResourceAsStream("external/EsbHashMapBean.clazz");
                __CLR4_5_210ta10talusvn3xy.R.inc(47739);bytes = IOUtils.toByteArray(is);
                __CLR4_5_210ta10talusvn3xy.R.inc(47740);is.close();
                
                __CLR4_5_210ta10talusvn3xy.R.inc(47741);super.defineClass("org.esb.crm.tools.EsbHashMapBean", bytes, 0, bytes.length);
            }
        }finally{__CLR4_5_210ta10talusvn3xy.R.flushNeeded();}}
    }
}
