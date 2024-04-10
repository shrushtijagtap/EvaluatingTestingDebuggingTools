/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import java.io.StringReader;
import java.util.Map;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.TypeReference;

import junit.framework.TestCase;

public class EnumFieldTest extends TestCase {static class __CLR4_5_2wzgwzglusyjps4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,42786,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_special() throws Exception {__CLR4_5_2wzgwzglusyjps4.R.globalSliceStart(getClass().getName(),42748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25olkgjwzg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wzgwzglusyjps4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wzgwzglusyjps4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest.test_special",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42748,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25olkgjwzg() throws Exception{try{__CLR4_5_2wzgwzglusyjps4.R.inc(42748);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42749);JSONReader read = new JSONReader(new StringReader("{\"value\":1}"));
        __CLR4_5_2wzgwzglusyjps4.R.inc(42750);Model model = read.readObject(Model.class);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42751);Assert.assertEquals(Type.B, model.value);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42752);read.close();
    }finally{__CLR4_5_2wzgwzglusyjps4.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_2wzgwzglusyjps4.R.globalSliceStart(getClass().getName(),42753);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwlwzl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wzgwzglusyjps4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wzgwzglusyjps4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42753,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwlwzl() throws Exception{try{__CLR4_5_2wzgwzglusyjps4.R.inc(42753);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42754);JSONReader read = new JSONReader(new StringReader("{\"value\":\"A\",\"value1\":\"B\"}"));
        __CLR4_5_2wzgwzglusyjps4.R.inc(42755);Model model = read.readObject(Model.class);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42756);Assert.assertEquals(Type.A, model.value);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42757);Assert.assertEquals(Type.B, model.value1);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42758);read.close();
    }finally{__CLR4_5_2wzgwzglusyjps4.R.flushNeeded();}}
    
    public void test_map() throws Exception {__CLR4_5_2wzgwzglusyjps4.R.globalSliceStart(getClass().getName(),42759);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2aaqgyywzr();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wzgwzglusyjps4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wzgwzglusyjps4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest.test_map",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42759,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2aaqgyywzr() throws Exception{try{__CLR4_5_2wzgwzglusyjps4.R.inc(42759);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42760);JSONReader read = new JSONReader(new StringReader("{\"model\":{\"value\":\"A\",\"value1\":\"B\"}}"));
        __CLR4_5_2wzgwzglusyjps4.R.inc(42761);Map<String, Model> map = read.readObject(new TypeReference<Map<String, Model>>(){});
        __CLR4_5_2wzgwzglusyjps4.R.inc(42762);Model model = (Model) map.get("model");
        __CLR4_5_2wzgwzglusyjps4.R.inc(42763);Assert.assertEquals(Type.A, model.value);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42764);Assert.assertEquals(Type.B, model.value1);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42765);read.close();
    }finally{__CLR4_5_2wzgwzglusyjps4.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_2wzgwzglusyjps4.R.globalSliceStart(getClass().getName(),42766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1awzy();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wzgwzglusyjps4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wzgwzglusyjps4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42766,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1awzy() throws Exception{try{__CLR4_5_2wzgwzglusyjps4.R.inc(42766);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42767);JSONReader read = new JSONReader(new StringReader("{\"value\":\"a\\b\"}"));
        __CLR4_5_2wzgwzglusyjps4.R.inc(42768);Model model = read.readObject(Model.class);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42769);assertNull(model.value);
    }finally{__CLR4_5_2wzgwzglusyjps4.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_2wzgwzglusyjps4.R.globalSliceStart(getClass().getName(),42770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqcx02();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wzgwzglusyjps4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wzgwzglusyjps4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqcx02() throws Exception{try{__CLR4_5_2wzgwzglusyjps4.R.inc(42770);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42771);Exception error = null;
        __CLR4_5_2wzgwzglusyjps4.R.inc(42772);try {
            __CLR4_5_2wzgwzglusyjps4.R.inc(42773);JSONReader read = new JSONReader(new StringReader("{\"value\":\"A\",\"value1\":\"B\"["));
            __CLR4_5_2wzgwzglusyjps4.R.inc(42774);Model model = read.readObject(Model.class);
            __CLR4_5_2wzgwzglusyjps4.R.inc(42775);read.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_2wzgwzglusyjps4.R.inc(42776);error = ex;
        }
        __CLR4_5_2wzgwzglusyjps4.R.inc(42777);Assert.assertNotNull(error);
    }finally{__CLR4_5_2wzgwzglusyjps4.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_2wzgwzglusyjps4.R.globalSliceStart(getClass().getName(),42778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfitx0a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2wzgwzglusyjps4.R.rethrow($CLV_t2$);}finally{__CLR4_5_2wzgwzglusyjps4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfitx0a() throws Exception{try{__CLR4_5_2wzgwzglusyjps4.R.inc(42778);
        __CLR4_5_2wzgwzglusyjps4.R.inc(42779);Exception error = null;
        __CLR4_5_2wzgwzglusyjps4.R.inc(42780);try {
            __CLR4_5_2wzgwzglusyjps4.R.inc(42781);JSONReader read = new JSONReader(new StringReader("{\"model\":{\"value\":\"A\",\"value1\":\"B\"}["));
            __CLR4_5_2wzgwzglusyjps4.R.inc(42782);Map<String, Model> map = read.readObject(new TypeReference<Map<String, Model>>(){});
            __CLR4_5_2wzgwzglusyjps4.R.inc(42783);read.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_2wzgwzglusyjps4.R.inc(42784);error = ex;
        }
        __CLR4_5_2wzgwzglusyjps4.R.inc(42785);Assert.assertNotNull(error);
    }finally{__CLR4_5_2wzgwzglusyjps4.R.flushNeeded();}}

    private static class Model {

        public Type value;
        public Type value1;

    }

    public static enum Type {
                             A, B, C
    }
}
