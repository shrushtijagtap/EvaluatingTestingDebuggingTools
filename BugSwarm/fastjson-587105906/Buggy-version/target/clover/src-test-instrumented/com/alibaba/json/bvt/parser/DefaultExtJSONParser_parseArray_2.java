/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

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
public class DefaultExtJSONParser_parseArray_2 extends TestCase {static class __CLR4_1_101h191h19luszwcdo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,68801,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

	public void test_0() throws Exception {__CLR4_1_101h191h19luszwcdo.R.globalSliceStart(getClass().getName(),68733);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21h19();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h191h19luszwcdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h191h19luszwcdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68733,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21h19() throws Exception{try{__CLR4_1_101h191h19luszwcdo.R.inc(68733);
        __CLR4_1_101h191h19luszwcdo.R.inc(68734);DefaultJSONParser parser = new DefaultJSONParser("[['1']]");
        __CLR4_1_101h191h19luszwcdo.R.inc(68735);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_1_101h191h19luszwcdo.R.inc(68736);List<List<Integer>> list = (List<List<Integer>>) parser.parseArrayWithType(new TypeReference<List<List<Integer>>>() {
        }.getType());
        __CLR4_1_101h191h19luszwcdo.R.inc(68737);Assert.assertEquals(new Integer(1), list.get(0).get(0));
    }finally{__CLR4_1_101h191h19luszwcdo.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101h191h19luszwcdo.R.globalSliceStart(getClass().getName(),68738);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1h1e();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h191h19luszwcdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h191h19luszwcdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68738,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1h1e() throws Exception{try{__CLR4_1_101h191h19luszwcdo.R.inc(68738);
        __CLR4_1_101h191h19luszwcdo.R.inc(68739);DefaultJSONParser parser = new DefaultJSONParser("['1','2']");
        __CLR4_1_101h191h19luszwcdo.R.inc(68740);parser.config(Feature.AllowISO8601DateFormat, false);
        __CLR4_1_101h191h19luszwcdo.R.inc(68741);List<Object> list = new ArrayList<Object>();
        __CLR4_1_101h191h19luszwcdo.R.inc(68742);parser.parseArray(Integer.class, list);
        __CLR4_1_101h191h19luszwcdo.R.inc(68743);Assert.assertEquals(new Integer(1), list.get(0));
        __CLR4_1_101h191h19luszwcdo.R.inc(68744);Assert.assertEquals(new Integer(2), list.get(1));
    }finally{__CLR4_1_101h191h19luszwcdo.R.flushNeeded();}}

    public void test_error_0() throws Exception {__CLR4_1_101h191h19luszwcdo.R.globalSliceStart(getClass().getName(),68745);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f0chxv1h1l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h191h19luszwcdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h191h19luszwcdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68745,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f0chxv1h1l() throws Exception{try{__CLR4_1_101h191h19luszwcdo.R.inc(68745);
        __CLR4_1_101h191h19luszwcdo.R.inc(68746);DefaultJSONParser parser = new DefaultJSONParser("['1','2'}");
        __CLR4_1_101h191h19luszwcdo.R.inc(68747);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101h191h19luszwcdo.R.inc(68748);Exception error = null;
        __CLR4_1_101h191h19luszwcdo.R.inc(68749);try {
            __CLR4_1_101h191h19luszwcdo.R.inc(68750);List<Object> list = new ArrayList<Object>();
            __CLR4_1_101h191h19luszwcdo.R.inc(68751);parser.parseArray(Integer.class, list);
        } catch (Exception ex) {
            __CLR4_1_101h191h19luszwcdo.R.inc(68752);error = ex;
        }
        __CLR4_1_101h191h19luszwcdo.R.inc(68753);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h191h19luszwcdo.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101h191h19luszwcdo.R.globalSliceStart(getClass().getName(),68754);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1h1u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h191h19luszwcdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h191h19luszwcdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68754,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1h1u() throws Exception{try{__CLR4_1_101h191h19luszwcdo.R.inc(68754);
        __CLR4_1_101h191h19luszwcdo.R.inc(68755);DefaultJSONParser parser = new DefaultJSONParser("[['1']]");
        __CLR4_1_101h191h19luszwcdo.R.inc(68756);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101h191h19luszwcdo.R.inc(68757);Exception error = null;
        __CLR4_1_101h191h19luszwcdo.R.inc(68758);try {
            __CLR4_1_101h191h19luszwcdo.R.inc(68759);parser.parseArrayWithType(new TypeReference<Map<?, ?>>() {
            }.getType());
        } catch (Exception ex) {
            __CLR4_1_101h191h19luszwcdo.R.inc(68760);error = ex;
        }
        __CLR4_1_101h191h19luszwcdo.R.inc(68761);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h191h19luszwcdo.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101h191h19luszwcdo.R.globalSliceStart(getClass().getName(),68762);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1h22();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h191h19luszwcdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h191h19luszwcdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68762,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1h22() throws Exception{try{__CLR4_1_101h191h19luszwcdo.R.inc(68762);
        __CLR4_1_101h191h19luszwcdo.R.inc(68763);DefaultJSONParser parser = new DefaultJSONParser("[new X()]");
        __CLR4_1_101h191h19luszwcdo.R.inc(68764);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101h191h19luszwcdo.R.inc(68765);List list = new ArrayList();
        __CLR4_1_101h191h19luszwcdo.R.inc(68766);Exception error = null;
        __CLR4_1_101h191h19luszwcdo.R.inc(68767);try {
            __CLR4_1_101h191h19luszwcdo.R.inc(68768);parser.parseArray(list);
        } catch (Exception ex) {
            __CLR4_1_101h191h19luszwcdo.R.inc(68769);error = ex;
        }
        __CLR4_1_101h191h19luszwcdo.R.inc(68770);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h191h19luszwcdo.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101h191h19luszwcdo.R.globalSliceStart(getClass().getName(),68771);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1h2b();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h191h19luszwcdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h191h19luszwcdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68771,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1h2b() throws Exception{try{__CLR4_1_101h191h19luszwcdo.R.inc(68771);
        __CLR4_1_101h191h19luszwcdo.R.inc(68772);DefaultJSONParser parser = new DefaultJSONParser("[] a");
        __CLR4_1_101h191h19luszwcdo.R.inc(68773);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101h191h19luszwcdo.R.inc(68774);List list = new ArrayList();
        __CLR4_1_101h191h19luszwcdo.R.inc(68775);Exception error = null;
        __CLR4_1_101h191h19luszwcdo.R.inc(68776);try {
            __CLR4_1_101h191h19luszwcdo.R.inc(68777);parser.parseArray(list);
            __CLR4_1_101h191h19luszwcdo.R.inc(68778);parser.close();
        } catch (Exception ex) {
            __CLR4_1_101h191h19luszwcdo.R.inc(68779);error = ex;
        }
        __CLR4_1_101h191h19luszwcdo.R.inc(68780);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h191h19luszwcdo.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101h191h19luszwcdo.R.globalSliceStart(getClass().getName(),68781);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1h2l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h191h19luszwcdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h191h19luszwcdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68781,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1h2l() throws Exception{try{__CLR4_1_101h191h19luszwcdo.R.inc(68781);
        __CLR4_1_101h191h19luszwcdo.R.inc(68782);DefaultJSONParser parser = new DefaultJSONParser("['1','2'}");
        __CLR4_1_101h191h19luszwcdo.R.inc(68783);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101h191h19luszwcdo.R.inc(68784);Exception error = null;
        __CLR4_1_101h191h19luszwcdo.R.inc(68785);try {
            __CLR4_1_101h191h19luszwcdo.R.inc(68786);parser.parseArray(new Type[] {});
        } catch (Exception ex) {
            __CLR4_1_101h191h19luszwcdo.R.inc(68787);error = ex;
        }
        __CLR4_1_101h191h19luszwcdo.R.inc(68788);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h191h19luszwcdo.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101h191h19luszwcdo.R.globalSliceStart(getClass().getName(),68789);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81h2t();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h191h19luszwcdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h191h19luszwcdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68789,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81h2t() throws Exception{try{__CLR4_1_101h191h19luszwcdo.R.inc(68789);
        __CLR4_1_101h191h19luszwcdo.R.inc(68790);DefaultJSONParser parser = new DefaultJSONParser("[]");
        __CLR4_1_101h191h19luszwcdo.R.inc(68791);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101h191h19luszwcdo.R.inc(68792);Assert.assertEquals(1, parser.parseArray(new Type[] { Integer[].class }).length);
    }finally{__CLR4_1_101h191h19luszwcdo.R.flushNeeded();}}
    
    public void test_error_6() throws Exception {__CLR4_1_101h191h19luszwcdo.R.globalSliceStart(getClass().getName(),68793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1h2x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101h191h19luszwcdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101h191h19luszwcdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.DefaultExtJSONParser_parseArray_2.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68793,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1h2x() throws Exception{try{__CLR4_1_101h191h19luszwcdo.R.inc(68793);
        __CLR4_1_101h191h19luszwcdo.R.inc(68794);DefaultJSONParser parser = new DefaultJSONParser("['1' 1 '2'}");
        __CLR4_1_101h191h19luszwcdo.R.inc(68795);parser.config(Feature.AllowISO8601DateFormat, false);

        __CLR4_1_101h191h19luszwcdo.R.inc(68796);Exception error = null;
        __CLR4_1_101h191h19luszwcdo.R.inc(68797);try {
            __CLR4_1_101h191h19luszwcdo.R.inc(68798);parser.parseArray(new Type[] {Integer.class});
        } catch (Exception ex) {
            __CLR4_1_101h191h19luszwcdo.R.inc(68799);error = ex;
        }
        __CLR4_1_101h191h19luszwcdo.R.inc(68800);Assert.assertNotNull(error);
    }finally{__CLR4_1_101h191h19luszwcdo.R.flushNeeded();}}
}
