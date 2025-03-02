/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.serializer;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONReader;

import junit.framework.TestCase;

public class BooleanFieldTest2 extends TestCase {static class __CLR4_1_101rh51rh5luszwetl{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,82305,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_true() throws Exception {__CLR4_1_101rh51rh5luszwetl.R.globalSliceStart(getClass().getName(),82265);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10zgwum61rh5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rh51rh5luszwetl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rh51rh5luszwetl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_true",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82265,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10zgwum61rh5() throws Exception{try{__CLR4_1_101rh51rh5luszwetl.R.inc(82265);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82266);String text = "{\"f001\":1001,\"value\":true}";

        __CLR4_1_101rh51rh5luszwetl.R.inc(82267);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82268);Assert.assertTrue(model.value);
    }finally{__CLR4_1_101rh51rh5luszwetl.R.flushNeeded();}}

    public void test_false() throws Exception {__CLR4_1_101rh51rh5luszwetl.R.globalSliceStart(getClass().getName(),82269);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10g0rozn1rh9();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rh51rh5luszwetl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rh51rh5luszwetl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_false",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82269,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10g0rozn1rh9() throws Exception{try{__CLR4_1_101rh51rh5luszwetl.R.inc(82269);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82270);String text = "{\"f001\":1001,\"value\":false}";

        __CLR4_1_101rh51rh5luszwetl.R.inc(82271);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82272);Assert.assertFalse(model.value);
    }finally{__CLR4_1_101rh51rh5luszwetl.R.flushNeeded();}}

    public void test_true_reader() throws Exception {__CLR4_1_101rh51rh5luszwetl.R.globalSliceStart(getClass().getName(),82273);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102q8nxu1rhd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rh51rh5luszwetl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rh51rh5luszwetl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_true_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82273,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102q8nxu1rhd() throws Exception{try{__CLR4_1_101rh51rh5luszwetl.R.inc(82273);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82274);String text = "{\"f001\":1001,\"value\":true}";

        __CLR4_1_101rh51rh5luszwetl.R.inc(82275);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101rh51rh5luszwetl.R.inc(82276);Model model = reader.readObject(Model.class);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82277);Assert.assertTrue(model.value);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82278);reader.close();
    }finally{__CLR4_1_101rh51rh5luszwetl.R.flushNeeded();}}

    public void test_false_reader() throws Exception {__CLR4_1_101rh51rh5luszwetl.R.globalSliceStart(getClass().getName(),82279);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102jmfg31rhj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rh51rh5luszwetl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rh51rh5luszwetl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_false_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82279,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102jmfg31rhj() throws Exception{try{__CLR4_1_101rh51rh5luszwetl.R.inc(82279);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82280);String text = "{\"f001\":1001,\"value\":false}";

        __CLR4_1_101rh51rh5luszwetl.R.inc(82281);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101rh51rh5luszwetl.R.inc(82282);Model model = reader.readObject(Model.class);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82283);Assert.assertFalse(model.value);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82284);reader.close();
    }finally{__CLR4_1_101rh51rh5luszwetl.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_101rh51rh5luszwetl.R.globalSliceStart(getClass().getName(),82285);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1rhp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rh51rh5luszwetl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rh51rh5luszwetl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82285,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1rhp() throws Exception{try{__CLR4_1_101rh51rh5luszwetl.R.inc(82285);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82286);String text = "{\"value\":1}";

        __CLR4_1_101rh51rh5luszwetl.R.inc(82287);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82288);Assert.assertTrue(model.value);
    }finally{__CLR4_1_101rh51rh5luszwetl.R.flushNeeded();}}
    
    public void test_0() throws Exception {__CLR4_1_101rh51rh5luszwetl.R.globalSliceStart(getClass().getName(),82289);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21rht();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rh51rh5luszwetl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rh51rh5luszwetl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82289,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21rht() throws Exception{try{__CLR4_1_101rh51rh5luszwetl.R.inc(82289);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82290);String text = "{\"value\":0}";

        __CLR4_1_101rh51rh5luszwetl.R.inc(82291);Model model = JSON.parseObject(text, Model.class);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82292);Assert.assertFalse(model.value);
    }finally{__CLR4_1_101rh51rh5luszwetl.R.flushNeeded();}}
    
    public void test_1_reader() throws Exception {__CLR4_1_101rh51rh5luszwetl.R.globalSliceStart(getClass().getName(),82293);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107knkyj1rhx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rh51rh5luszwetl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rh51rh5luszwetl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_1_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82293,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107knkyj1rhx() throws Exception{try{__CLR4_1_101rh51rh5luszwetl.R.inc(82293);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82294);String text = "{\"value\":1}";

        __CLR4_1_101rh51rh5luszwetl.R.inc(82295);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101rh51rh5luszwetl.R.inc(82296);Model model = reader.readObject(Model.class);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82297);Assert.assertTrue(model.value);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82298);reader.close();
    }finally{__CLR4_1_101rh51rh5luszwetl.R.flushNeeded();}}
    
    public void test_0_reader() throws Exception {__CLR4_1_101rh51rh5luszwetl.R.globalSliceStart(getClass().getName(),82299);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10et2jhi1ri3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101rh51rh5luszwetl.R.rethrow($CLV_t2$);}finally{__CLR4_1_101rh51rh5luszwetl.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.serializer.BooleanFieldTest2.test_0_reader",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),82299,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10et2jhi1ri3() throws Exception{try{__CLR4_1_101rh51rh5luszwetl.R.inc(82299);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82300);String text = "{\"value\":0}";

        __CLR4_1_101rh51rh5luszwetl.R.inc(82301);JSONReader reader = new JSONReader(new StringReader(text));
        __CLR4_1_101rh51rh5luszwetl.R.inc(82302);Model model = reader.readObject(Model.class);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82303);Assert.assertFalse(model.value);
        __CLR4_1_101rh51rh5luszwetl.R.inc(82304);reader.close();
    }finally{__CLR4_1_101rh51rh5luszwetl.R.flushNeeded();}}

    public static class Model {

        public boolean value;
    }
}
