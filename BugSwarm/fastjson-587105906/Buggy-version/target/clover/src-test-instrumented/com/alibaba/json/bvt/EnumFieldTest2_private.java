/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt;

import java.io.StringReader;

import org.junit.Assert;

import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONReader;
import com.alibaba.fastjson.parser.Feature;

import junit.framework.TestCase;

public class EnumFieldTest2_private extends TestCase {static class __CLR4_1_10x23x23luszw53g{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,42900,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_10x23x23luszw53g.R.globalSliceStart(getClass().getName(),42843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp2x23();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10x23x23luszw53g.R.rethrow($CLV_t2$);}finally{__CLR4_1_10x23x23luszw53g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2_private.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42843,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp2x23() throws Exception{try{__CLR4_1_10x23x23luszw53g.R.inc(42843);
        __CLR4_1_10x23x23luszw53g.R.inc(42844);JSONReader read = new JSONReader(new StringReader("[1,2]"));
        __CLR4_1_10x23x23luszw53g.R.inc(42845);read.config(Feature.SupportArrayToBean, true);
        __CLR4_1_10x23x23luszw53g.R.inc(42846);Model model = read.readObject(Model.class);
        __CLR4_1_10x23x23luszw53g.R.inc(42847);Assert.assertEquals(Type.B, model.value);
        __CLR4_1_10x23x23luszw53g.R.inc(42848);Assert.assertEquals(Type.C, model.value1);
        __CLR4_1_10x23x23luszw53g.R.inc(42849);read.close();
    }finally{__CLR4_1_10x23x23luszw53g.R.flushNeeded();}}
    
    public void test_1() throws Exception {__CLR4_1_10x23x23luszw53g.R.globalSliceStart(getClass().getName(),42850);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwlx2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10x23x23luszw53g.R.rethrow($CLV_t2$);}finally{__CLR4_1_10x23x23luszw53g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2_private.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42850,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwlx2a() throws Exception{try{__CLR4_1_10x23x23luszw53g.R.inc(42850);
        __CLR4_1_10x23x23luszw53g.R.inc(42851);JSONReader read = new JSONReader(new StringReader("[\"A\",\"B\"]"));
        __CLR4_1_10x23x23luszw53g.R.inc(42852);read.config(Feature.SupportArrayToBean, true);
        __CLR4_1_10x23x23luszw53g.R.inc(42853);Model model = read.readObject(Model.class);
        __CLR4_1_10x23x23luszw53g.R.inc(42854);Assert.assertEquals(Type.A, model.value);
        __CLR4_1_10x23x23luszw53g.R.inc(42855);Assert.assertEquals(Type.B, model.value1);
        __CLR4_1_10x23x23luszw53g.R.inc(42856);read.close();
    }finally{__CLR4_1_10x23x23luszw53g.R.flushNeeded();}}
    
    public void test_2() throws Exception {__CLR4_1_10x23x23luszw53g.R.globalSliceStart(getClass().getName(),42857);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k44x2h();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10x23x23luszw53g.R.rethrow($CLV_t2$);}finally{__CLR4_1_10x23x23luszw53g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2_private.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42857,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k44x2h() throws Exception{try{__CLR4_1_10x23x23luszw53g.R.inc(42857);
        __CLR4_1_10x23x23luszw53g.R.inc(42858);JSONReader read = new JSONReader(new StringReader("[null,null]"));
        __CLR4_1_10x23x23luszw53g.R.inc(42859);read.config(Feature.SupportArrayToBean, true);
        __CLR4_1_10x23x23luszw53g.R.inc(42860);Model model = read.readObject(Model.class);
        __CLR4_1_10x23x23luszw53g.R.inc(42861);Assert.assertEquals(null, model.value);
        __CLR4_1_10x23x23luszw53g.R.inc(42862);Assert.assertEquals(null, model.value1);
        __CLR4_1_10x23x23luszw53g.R.inc(42863);read.close();
    }finally{__CLR4_1_10x23x23luszw53g.R.flushNeeded();}}
    
    public void test_error_1() throws Exception {__CLR4_1_10x23x23luszw53g.R.globalSliceStart(getClass().getName(),42864);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqcx2o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10x23x23luszw53g.R.rethrow($CLV_t2$);}finally{__CLR4_1_10x23x23luszw53g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2_private.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42864,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqcx2o() throws Exception{try{__CLR4_1_10x23x23luszw53g.R.inc(42864);
        __CLR4_1_10x23x23luszw53g.R.inc(42865);Exception error = null;
        __CLR4_1_10x23x23luszw53g.R.inc(42866);try {
            __CLR4_1_10x23x23luszw53g.R.inc(42867);JSONReader read = new JSONReader(new StringReader("[null:null]"));
            __CLR4_1_10x23x23luszw53g.R.inc(42868);read.config(Feature.SupportArrayToBean, true);
            __CLR4_1_10x23x23luszw53g.R.inc(42869);Model model = read.readObject(Model.class);
            __CLR4_1_10x23x23luszw53g.R.inc(42870);read.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_10x23x23luszw53g.R.inc(42871);error = ex;
        }
        __CLR4_1_10x23x23luszw53g.R.inc(42872);Assert.assertNotNull(error);
    }finally{__CLR4_1_10x23x23luszw53g.R.flushNeeded();}}
    
    public void test_error_n() throws Exception {__CLR4_1_10x23x23luszw53g.R.globalSliceStart(getClass().getName(),42873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_103ey91tx2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10x23x23luszw53g.R.rethrow($CLV_t2$);}finally{__CLR4_1_10x23x23luszw53g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2_private.test_error_n",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42873,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_103ey91tx2x() throws Exception{try{__CLR4_1_10x23x23luszw53g.R.inc(42873);
        __CLR4_1_10x23x23luszw53g.R.inc(42874);Exception error = null;
        __CLR4_1_10x23x23luszw53g.R.inc(42875);try {
            __CLR4_1_10x23x23luszw53g.R.inc(42876);JSONReader read = new JSONReader(new StringReader("[n"));
            __CLR4_1_10x23x23luszw53g.R.inc(42877);read.config(Feature.SupportArrayToBean, true);
            __CLR4_1_10x23x23luszw53g.R.inc(42878);Model model = read.readObject(Model.class);
            __CLR4_1_10x23x23luszw53g.R.inc(42879);read.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_10x23x23luszw53g.R.inc(42880);error = ex;
        }
        __CLR4_1_10x23x23luszw53g.R.inc(42881);Assert.assertNotNull(error);
    }finally{__CLR4_1_10x23x23luszw53g.R.flushNeeded();}}
    
    public void test_error_nu() throws Exception {__CLR4_1_10x23x23luszw53g.R.globalSliceStart(getClass().getName(),42882);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10b9biaax36();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10x23x23luszw53g.R.rethrow($CLV_t2$);}finally{__CLR4_1_10x23x23luszw53g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2_private.test_error_nu",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42882,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10b9biaax36() throws Exception{try{__CLR4_1_10x23x23luszw53g.R.inc(42882);
        __CLR4_1_10x23x23luszw53g.R.inc(42883);Exception error = null;
        __CLR4_1_10x23x23luszw53g.R.inc(42884);try {
            __CLR4_1_10x23x23luszw53g.R.inc(42885);JSONReader read = new JSONReader(new StringReader("[nu"));
            __CLR4_1_10x23x23luszw53g.R.inc(42886);read.config(Feature.SupportArrayToBean, true);
            __CLR4_1_10x23x23luszw53g.R.inc(42887);Model model = read.readObject(Model.class);
            __CLR4_1_10x23x23luszw53g.R.inc(42888);read.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_10x23x23luszw53g.R.inc(42889);error = ex;
        }
        __CLR4_1_10x23x23luszw53g.R.inc(42890);Assert.assertNotNull(error);
    }finally{__CLR4_1_10x23x23luszw53g.R.flushNeeded();}}
    
    public void test_error_nul() throws Exception {__CLR4_1_10x23x23luszw53g.R.globalSliceStart(getClass().getName(),42891);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10c2eljcx3f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_10x23x23luszw53g.R.rethrow($CLV_t2$);}finally{__CLR4_1_10x23x23luszw53g.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.EnumFieldTest2_private.test_error_nul",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),42891,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10c2eljcx3f() throws Exception{try{__CLR4_1_10x23x23luszw53g.R.inc(42891);
        __CLR4_1_10x23x23luszw53g.R.inc(42892);Exception error = null;
        __CLR4_1_10x23x23luszw53g.R.inc(42893);try {
            __CLR4_1_10x23x23luszw53g.R.inc(42894);JSONReader read = new JSONReader(new StringReader("[nul"));
            __CLR4_1_10x23x23luszw53g.R.inc(42895);read.config(Feature.SupportArrayToBean, true);
            __CLR4_1_10x23x23luszw53g.R.inc(42896);Model model = read.readObject(Model.class);
            __CLR4_1_10x23x23luszw53g.R.inc(42897);read.readObject(Model.class);
        } catch (JSONException ex) {
            __CLR4_1_10x23x23luszw53g.R.inc(42898);error = ex;
        }
        __CLR4_1_10x23x23luszw53g.R.inc(42899);Assert.assertNotNull(error);
    }finally{__CLR4_1_10x23x23luszw53g.R.flushNeeded();}}

    private static class Model {

        public Type value;
        public Type value1;

    }

    public static enum Type {
                             A, B, C
    }
}
