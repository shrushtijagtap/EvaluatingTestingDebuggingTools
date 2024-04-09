/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;

import junit.framework.TestCase;

public class BooleanFieldTest2 extends TestCase {static class __CLR4_1_101qix1qixlusqkj68{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,81073,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_true() throws Exception {__CLR4_1_101qix1qixlusqkj68.R.globalSliceStart(getClass().getName(),81033);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zgwum61qix();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qix1qixlusqkj68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qix1qixlusqkj68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_true",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81033,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zgwum61qix() throws Exception{try{__CLR4_1_101qix1qixlusqkj68.R.inc(81033);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81034);String text = "{\"f001\":1001,\"value\":true}";

        __CLR4_1_101qix1qixlusqkj68.R.inc(81035);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81036);Assert.assertTrue(model.value);
    }finally{__CLR4_1_101qix1qixlusqkj68.R.flushNeeded();}}

    public void test_false() throws Exception {__CLR4_1_101qix1qixlusqkj68.R.globalSliceStart(getClass().getName(),81037);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g0rozn1qj1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qix1qixlusqkj68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qix1qixlusqkj68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_false",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81037,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g0rozn1qj1() throws Exception{try{__CLR4_1_101qix1qixlusqkj68.R.inc(81037);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81038);String text = "{\"f001\":1001,\"value\":false}";

        __CLR4_1_101qix1qixlusqkj68.R.inc(81039);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81040);Assert.assertFalse(model.value);
    }finally{__CLR4_1_101qix1qixlusqkj68.R.flushNeeded();}}

    public void test_true_reader() throws Exception {__CLR4_1_101qix1qixlusqkj68.R.globalSliceStart(getClass().getName(),81041);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102q8nxu1qj5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qix1qixlusqkj68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qix1qixlusqkj68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_true_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81041,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102q8nxu1qj5() throws Exception{try{__CLR4_1_101qix1qixlusqkj68.R.inc(81041);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81042);String text = "{\"f001\":1001,\"value\":true}";

        __CLR4_1_101qix1qixlusqkj68.R.inc(81043);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101qix1qixlusqkj68.R.inc(81044);Model model = reader.readObject(Model.class);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81045);Assert.assertTrue(model.value);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81046);reader.close();
    }finally{__CLR4_1_101qix1qixlusqkj68.R.flushNeeded();}}

    public void test_false_reader() throws Exception {__CLR4_1_101qix1qixlusqkj68.R.globalSliceStart(getClass().getName(),81047);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102jmfg31qjb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qix1qixlusqkj68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qix1qixlusqkj68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_false_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81047,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102jmfg31qjb() throws Exception{try{__CLR4_1_101qix1qixlusqkj68.R.inc(81047);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81048);String text = "{\"f001\":1001,\"value\":false}";

        __CLR4_1_101qix1qixlusqkj68.R.inc(81049);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101qix1qixlusqkj68.R.inc(81050);Model model = reader.readObject(Model.class);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81051);Assert.assertFalse(model.value);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81052);reader.close();
    }finally{__CLR4_1_101qix1qixlusqkj68.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_101qix1qixlusqkj68.R.globalSliceStart(getClass().getName(),81053);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1qjh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qix1qixlusqkj68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qix1qixlusqkj68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81053,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1qjh() throws Exception{try{__CLR4_1_101qix1qixlusqkj68.R.inc(81053);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81054);String text = "{\"value\":1}";

        __CLR4_1_101qix1qixlusqkj68.R.inc(81055);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81056);Assert.assertTrue(model.value);
    }finally{__CLR4_1_101qix1qixlusqkj68.R.flushNeeded();}}
    
    public void test_0() throws Exception {__CLR4_1_101qix1qixlusqkj68.R.globalSliceStart(getClass().getName(),81057);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21qjl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qix1qixlusqkj68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qix1qixlusqkj68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81057,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21qjl() throws Exception{try{__CLR4_1_101qix1qixlusqkj68.R.inc(81057);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81058);String text = "{\"value\":0}";

        __CLR4_1_101qix1qixlusqkj68.R.inc(81059);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81060);Assert.assertFalse(model.value);
    }finally{__CLR4_1_101qix1qixlusqkj68.R.flushNeeded();}}
    
    public void test_1_reader() throws Exception {__CLR4_1_101qix1qixlusqkj68.R.globalSliceStart(getClass().getName(),81061);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107knkyj1qjp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qix1qixlusqkj68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qix1qixlusqkj68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_1_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81061,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107knkyj1qjp() throws Exception{try{__CLR4_1_101qix1qixlusqkj68.R.inc(81061);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81062);String text = "{\"value\":1}";

        __CLR4_1_101qix1qixlusqkj68.R.inc(81063);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101qix1qixlusqkj68.R.inc(81064);Model model = reader.readObject(Model.class);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81065);Assert.assertTrue(model.value);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81066);reader.close();
    }finally{__CLR4_1_101qix1qixlusqkj68.R.flushNeeded();}}
    
    public void test_0_reader() throws Exception {__CLR4_1_101qix1qixlusqkj68.R.globalSliceStart(getClass().getName(),81067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10et2jhi1qjv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qix1qixlusqkj68.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qix1qixlusqkj68.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_0_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),81067,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10et2jhi1qjv() throws Exception{try{__CLR4_1_101qix1qixlusqkj68.R.inc(81067);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81068);String text = "{\"value\":0}";

        __CLR4_1_101qix1qixlusqkj68.R.inc(81069);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101qix1qixlusqkj68.R.inc(81070);Model model = reader.readObject(Model.class);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81071);Assert.assertFalse(model.value);
        __CLR4_1_101qix1qixlusqkj68.R.inc(81072);reader.close();
    }finally{__CLR4_1_101qix1qixlusqkj68.R.flushNeeded();}}

    public static class Model {

        public boolean value;
    }
}
