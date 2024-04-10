/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class EnumFieldTest2 extends TestCase {static class __CLR4_5_2x0ix0ilusyjps8{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,42843,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_2x0ix0ilusyjps8.R.globalSliceStart(getClass().getName(),42786);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp2x0i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2x0ix0ilusyjps8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2x0ix0ilusyjps8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42786,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp2x0i() throws Exception{try{__CLR4_5_2x0ix0ilusyjps8.R.inc(42786);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42787);JSONReader read = new JSONReader(new StringReader("[1,2]"));
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42788);read.config(Feature.SupportArrayToBean, true);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42789);Model model = read.readObject(Model.class);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42790);Assert.assertEquals(Type.B, model.value);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42791);Assert.assertEquals(Type.C, model.value1);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42792);read.close();
    }finally{__CLR4_5_2x0ix0ilusyjps8.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_5_2x0ix0ilusyjps8.R.globalSliceStart(getClass().getName(),42793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwlx0p();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2x0ix0ilusyjps8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2x0ix0ilusyjps8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42793,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwlx0p() throws Exception{try{__CLR4_5_2x0ix0ilusyjps8.R.inc(42793);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42794);JSONReader read = new JSONReader(new StringReader("[\"A\",\"B\"]"));
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42795);read.config(Feature.SupportArrayToBean, true);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42796);Model model = read.readObject(Model.class);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42797);Assert.assertEquals(Type.A, model.value);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42798);Assert.assertEquals(Type.B, model.value1);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42799);read.close();
    }finally{__CLR4_5_2x0ix0ilusyjps8.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_5_2x0ix0ilusyjps8.R.globalSliceStart(getClass().getName(),42800);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k44x0w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2x0ix0ilusyjps8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2x0ix0ilusyjps8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42800,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k44x0w() throws Exception{try{__CLR4_5_2x0ix0ilusyjps8.R.inc(42800);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42801);JSONReader read = new JSONReader(new StringReader("[null,null]"));
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42802);read.config(Feature.SupportArrayToBean, true);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42803);Model model = read.readObject(Model.class);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42804);Assert.assertEquals(null, model.value);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42805);Assert.assertEquals(null, model.value1);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42806);read.close();
    }finally{__CLR4_5_2x0ix0ilusyjps8.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_5_2x0ix0ilusyjps8.R.globalSliceStart(getClass().getName(),42807);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqcx13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2x0ix0ilusyjps8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2x0ix0ilusyjps8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42807,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqcx13() throws Exception{try{__CLR4_5_2x0ix0ilusyjps8.R.inc(42807);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42808);Exception error = null;
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42809);try {
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42810);JSONReader read = new JSONReader(new StringReader("[null:null]"));
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42811);read.config(Feature.SupportArrayToBean, true);
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42812);Model model = read.readObject(Model.class);
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42813);read.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42814);error = ex;
        }
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42815);Assert.assertNotNull(error);
    }finally{__CLR4_5_2x0ix0ilusyjps8.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_5_2x0ix0ilusyjps8.R.globalSliceStart(getClass().getName(),42816);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_23ey91tx1c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2x0ix0ilusyjps8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2x0ix0ilusyjps8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2.test_error_n",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42816,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_23ey91tx1c() throws Exception{try{__CLR4_5_2x0ix0ilusyjps8.R.inc(42816);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42817);Exception error = null;
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42818);try {
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42819);JSONReader read = new JSONReader(new StringReader("[n"));
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42820);read.config(Feature.SupportArrayToBean, true);
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42821);Model model = read.readObject(Model.class);
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42822);read.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42823);error = ex;
        }
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42824);Assert.assertNotNull(error);
    }finally{__CLR4_5_2x0ix0ilusyjps8.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_5_2x0ix0ilusyjps8.R.globalSliceStart(getClass().getName(),42825);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2b9biaax1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2x0ix0ilusyjps8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2x0ix0ilusyjps8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2.test_error_nu",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42825,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2b9biaax1l() throws Exception{try{__CLR4_5_2x0ix0ilusyjps8.R.inc(42825);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42826);Exception error = null;
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42827);try {
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42828);JSONReader read = new JSONReader(new StringReader("[nu"));
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42829);read.config(Feature.SupportArrayToBean, true);
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42830);Model model = read.readObject(Model.class);
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42831);read.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42832);error = ex;
        }
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42833);Assert.assertNotNull(error);
    }finally{__CLR4_5_2x0ix0ilusyjps8.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_5_2x0ix0ilusyjps8.R.globalSliceStart(getClass().getName(),42834);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2c2eljcx1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2x0ix0ilusyjps8.R.rethrow($CLV_t2$);}finally{__CLR4_5_2x0ix0ilusyjps8.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2.test_error_nul",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),42834,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2c2eljcx1u() throws Exception{try{__CLR4_5_2x0ix0ilusyjps8.R.inc(42834);
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42835);Exception error = null;
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42836);try {
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42837);JSONReader read = new JSONReader(new StringReader("[nul"));
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42838);read.config(Feature.SupportArrayToBean, true);
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42839);Model model = read.readObject(Model.class);
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42840);read.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_5_2x0ix0ilusyjps8.R.inc(42841);error = ex;
        }
        __CLR4_5_2x0ix0ilusyjps8.R.inc(42842);Assert.assertNotNull(error);
    }finally{__CLR4_5_2x0ix0ilusyjps8.R.flushNeeded();}}

    public static class Model {

        public Type value;
        public Type value1;

    }

    public static enum Type {
                             A, B, C
    }
}
