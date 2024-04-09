/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import junit.framework.TestCase;

import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.Feature;

@SuppressWarnings("deprecation")
public class DefaultExtJSONParser_parseArray_2 extends TestCase {static class __CLR4_5_21h0y1h0ylusvnckj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,68790,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceStart(getClass().getName(),68722);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21h0y();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h0y1h0ylusvnckj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68722,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21h0y() throws Exception{try{__CLR4_5_21h0y1h0ylusvnckj.R.inc(68722);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68723);DefaultJSONParser parser = new DefaultJSONParser("[['1']]");
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68724);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68725);List<List<Integer>> list = (List<List<Integer>>) parser.parseArrayWithType(new TypeReference<List<List<Integer>>>() {
        }.getType());
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68726);Assert.assertEquals(new Integer(1), list.get(0).get(0));
    }finally{__CLR4_5_21h0y1h0ylusvnckj.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceStart(getClass().getName(),68727);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1h13();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h0y1h0ylusvnckj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68727,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1h13() throws Exception{try{__CLR4_5_21h0y1h0ylusvnckj.R.inc(68727);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68728);DefaultJSONParser parser = new DefaultJSONParser("['1','2']");
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68729);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68730);List<Object> list = new ArrayList<Object>();
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68731);parser.parseArray(Integer.class, list);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68732);Assert.assertEquals(new Integer(1), list.get(0));
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68733);Assert.assertEquals(new Integer(2), list.get(1));
    }finally{__CLR4_5_21h0y1h0ylusvnckj.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceStart(getClass().getName(),68734);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2f0chxv1h1a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h0y1h0ylusvnckj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68734,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2f0chxv1h1a() throws Exception{try{__CLR4_5_21h0y1h0ylusvnckj.R.inc(68734);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68735);DefaultJSONParser parser = new DefaultJSONParser("['1','2'}");
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68736);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68737);Exception error = null;
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68738);try {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68739);List<Object> list = new ArrayList<Object>();
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68740);parser.parseArray(Integer.class, list);
        } catch (Exception ex) {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68741);error = ex;
        }
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68742);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h0y1h0ylusvnckj.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceStart(getClass().getName(),68743);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2i9cgqc1h1j();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h0y1h0ylusvnckj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68743,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2i9cgqc1h1j() throws Exception{try{__CLR4_5_21h0y1h0ylusvnckj.R.inc(68743);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68744);DefaultJSONParser parser = new DefaultJSONParser("[['1']]");
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68745);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68746);Exception error = null;
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68747);try {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68748);parser.parseArrayWithType(new TypeReference<Map<?, ?>>() {
            }.getType());
        } catch (Exception ex) {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68749);error = ex;
        }
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68750);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h0y1h0ylusvnckj.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceStart(getClass().getName(),68751);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1h1r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h0y1h0ylusvnckj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68751,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1h1r() throws Exception{try{__CLR4_5_21h0y1h0ylusvnckj.R.inc(68751);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68752);DefaultJSONParser parser = new DefaultJSONParser("[new X()]");
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68753);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68754);List list = new ArrayList();
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68755);Exception error = null;
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68756);try {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68757);parser.parseArray(list);
        } catch (Exception ex) {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68758);error = ex;
        }
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68759);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h0y1h0ylusvnckj.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceStart(getClass().getName(),68760);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1h20();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h0y1h0ylusvnckj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68760,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1h20() throws Exception{try{__CLR4_5_21h0y1h0ylusvnckj.R.inc(68760);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68761);DefaultJSONParser parser = new DefaultJSONParser("[] a");
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68762);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68763);List list = new ArrayList();
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68764);Exception error = null;
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68765);try {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68766);parser.parseArray(list);
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68767);parser.close();
        } catch (Exception ex) {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68768);error = ex;
        }
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68769);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h0y1h0ylusvnckj.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceStart(getClass().getName(),68770);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2s0cd3r1h2a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h0y1h0ylusvnckj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68770,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2s0cd3r1h2a() throws Exception{try{__CLR4_5_21h0y1h0ylusvnckj.R.inc(68770);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68771);DefaultJSONParser parser = new DefaultJSONParser("['1','2'}");
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68772);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68773);Exception error = null;
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68774);try {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68775);parser.parseArray(new Type[] {});
        } catch (Exception ex) {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68776);error = ex;
        }
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68777);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h0y1h0ylusvnckj.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceStart(getClass().getName(),68778);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2v9cbw81h2i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h0y1h0ylusvnckj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_5",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68778,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2v9cbw81h2i() throws Exception{try{__CLR4_5_21h0y1h0ylusvnckj.R.inc(68778);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68779);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68780);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68781);Assert.assertEquals(1, parser.parseArray(new Type[] { Integer[].class }).length);
    }finally{__CLR4_5_21h0y1h0ylusvnckj.R.flushNeeded();}}
    
    public void test_error_6() throws Exception {__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceStart(getClass().getName(),68782);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yicaop1h2m();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21h0y1h0ylusvnckj.R.rethrow($CLV_t2$);}finally{__CLR4_5_21h0y1h0ylusvnckj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_6",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),68782,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yicaop1h2m() throws Exception{try{__CLR4_5_21h0y1h0ylusvnckj.R.inc(68782);
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68783);DefaultJSONParser parser = new DefaultJSONParser("['1' 1 '2'}");
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68784);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68785);Exception error = null;
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68786);try {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68787);parser.parseArray(new Type[] {Integer.class});
        } catch (Exception ex) {
            __CLR4_5_21h0y1h0ylusvnckj.R.inc(68788);error = ex;
        }
        __CLR4_5_21h0y1h0ylusvnckj.R.inc(68789);Assert.assertNotNull(error);
    }finally{__CLR4_5_21h0y1h0ylusvnckj.R.flushNeeded();}}
}
