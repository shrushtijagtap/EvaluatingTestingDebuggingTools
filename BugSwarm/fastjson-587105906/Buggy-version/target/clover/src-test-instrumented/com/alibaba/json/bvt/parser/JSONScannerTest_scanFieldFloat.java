/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.parser.JSONScanner;

public class JSONScannerTest_scanFieldFloat extends TestCase {static class __CLR4_1_101it31it3luszwcmh{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,71132,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21it3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71031,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21it3() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71031);
        __CLR4_1_101it31it3luszwcmh.R.inc(71032);String text = "{\"value\":1.0}";
        __CLR4_1_101it31it3luszwcmh.R.inc(71033);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101it31it3luszwcmh.R.inc(71034);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    @SuppressWarnings("resource")
    public void test_isBlank() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71035);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_102ceda41it7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_isBlank",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71035,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_102ceda41it7() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71035);
        __CLR4_1_101it31it3luszwcmh.R.inc(71036);String text = "   {\"value\":1.0}";
        __CLR4_1_101it31it3luszwcmh.R.inc(71037);Assert.assertTrue(!new JSONScanner(text).isBlankInput());
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71038);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1ita();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71038,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1ita() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71038);
        __CLR4_1_101it31it3luszwcmh.R.inc(71039);String text = "{\"value\":\"1\"}";
        __CLR4_1_101it31it3luszwcmh.R.inc(71040);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101it31it3luszwcmh.R.inc(71041);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71042);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441ite();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71042,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441ite() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71042);
        __CLR4_1_101it31it3luszwcmh.R.inc(71043);String text = "{\"f1\":2,\"value\":1.0}";
        __CLR4_1_101it31it3luszwcmh.R.inc(71044);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101it31it3luszwcmh.R.inc(71045);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_3() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71046);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10de3lbn1iti();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71046,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10de3lbn1iti() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71046);
        __CLR4_1_101it31it3luszwcmh.R.inc(71047);String text = "{\"value\":1.01}";
        __CLR4_1_101it31it3luszwcmh.R.inc(71048);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101it31it3luszwcmh.R.inc(71049);Assert.assertTrue(1.01F == obj.getValue());
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_4() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71050);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10a53mj61itm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71050,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10a53mj61itm() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71050);
        __CLR4_1_101it31it3luszwcmh.R.inc(71051);String text = "{\"value\":1.}";
        __CLR4_1_101it31it3luszwcmh.R.inc(71052);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101it31it3luszwcmh.R.inc(71053);Assert.assertTrue(1F == obj.getValue());
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_error_1() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71054);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10i9cgqc1itq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71054,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10i9cgqc1itq() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71054);
        __CLR4_1_101it31it3luszwcmh.R.inc(71055);String text = "{\"value\":922337203685477580723}";
        __CLR4_1_101it31it3luszwcmh.R.inc(71056);VO obj = JSON.parseObject(text, VO.class);
        __CLR4_1_101it31it3luszwcmh.R.inc(71057);Assert.assertTrue(922337203685477580723F == obj.getValue());
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_error_2() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71058);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10licfit1itu();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71058,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10licfit1itu() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71058);
        __CLR4_1_101it31it3luszwcmh.R.inc(71059);JSONException error = null;
        __CLR4_1_101it31it3luszwcmh.R.inc(71060);try {
            __CLR4_1_101it31it3luszwcmh.R.inc(71061);String text = "{\"value\":32M}";
            __CLR4_1_101it31it3luszwcmh.R.inc(71062);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101it31it3luszwcmh.R.inc(71063);error = ex;
        }
        __CLR4_1_101it31it3luszwcmh.R.inc(71064);Assert.assertNotNull(error);
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_error_3() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10orceba1iu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71065,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10orceba1iu1() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71065);
        __CLR4_1_101it31it3luszwcmh.R.inc(71066);JSONException error = null;
        __CLR4_1_101it31it3luszwcmh.R.inc(71067);try {
            __CLR4_1_101it31it3luszwcmh.R.inc(71068);String text = "{\"value\":32}{";
            __CLR4_1_101it31it3luszwcmh.R.inc(71069);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101it31it3luszwcmh.R.inc(71070);error = ex;
        }
        __CLR4_1_101it31it3luszwcmh.R.inc(71071);Assert.assertNotNull(error);
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_error_4() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71072);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10s0cd3r1iu8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71072,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10s0cd3r1iu8() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71072);
        __CLR4_1_101it31it3luszwcmh.R.inc(71073);JSONException error = null;
        __CLR4_1_101it31it3luszwcmh.R.inc(71074);try {
            __CLR4_1_101it31it3luszwcmh.R.inc(71075);String text = "{\"value\":\u4e2d}";
            __CLR4_1_101it31it3luszwcmh.R.inc(71076);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101it31it3luszwcmh.R.inc(71077);error = ex;
        }
        __CLR4_1_101it31it3luszwcmh.R.inc(71078);Assert.assertNotNull(error);
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_error_5() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71079);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10v9cbw81iuf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_5",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71079,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10v9cbw81iuf() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71079);
        __CLR4_1_101it31it3luszwcmh.R.inc(71080);JSONException error = null;
        __CLR4_1_101it31it3luszwcmh.R.inc(71081);try {
            __CLR4_1_101it31it3luszwcmh.R.inc(71082);String text = "{\"value\":3.F";
            __CLR4_1_101it31it3luszwcmh.R.inc(71083);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101it31it3luszwcmh.R.inc(71084);error = ex;
        }
        __CLR4_1_101it31it3luszwcmh.R.inc(71085);Assert.assertNotNull(error);
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_error_6() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71086);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yicaop1ium();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_6",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71086,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yicaop1ium() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71086);
        __CLR4_1_101it31it3luszwcmh.R.inc(71087);JSONException error = null;
        __CLR4_1_101it31it3luszwcmh.R.inc(71088);try {
            __CLR4_1_101it31it3luszwcmh.R.inc(71089);String text = "{\"value\":3.2]";
            __CLR4_1_101it31it3luszwcmh.R.inc(71090);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101it31it3luszwcmh.R.inc(71091);error = ex;
        }
        __CLR4_1_101it31it3luszwcmh.R.inc(71092);Assert.assertNotNull(error);
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_error_7() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71093);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9rshy1iut();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_7",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71093,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9rshy1iut() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71093);
        __CLR4_1_101it31it3luszwcmh.R.inc(71094);JSONException error = null;
        __CLR4_1_101it31it3luszwcmh.R.inc(71095);try {
            __CLR4_1_101it31it3luszwcmh.R.inc(71096);String text = "{\"value\":3.2}]";
            __CLR4_1_101it31it3luszwcmh.R.inc(71097);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101it31it3luszwcmh.R.inc(71098);error = ex;
        }
        __CLR4_1_101it31it3luszwcmh.R.inc(71099);Assert.assertNotNull(error);
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_error_8() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71100);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u0rtph1iv0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_8",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71100,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u0rtph1iv0() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71100);
        __CLR4_1_101it31it3luszwcmh.R.inc(71101);JSONException error = null;
        __CLR4_1_101it31it3luszwcmh.R.inc(71102);try {
            __CLR4_1_101it31it3luszwcmh.R.inc(71103);String text = "{\"value\":3.2}}";
            __CLR4_1_101it31it3luszwcmh.R.inc(71104);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101it31it3luszwcmh.R.inc(71105);error = ex;
        }
        __CLR4_1_101it31it3luszwcmh.R.inc(71106);Assert.assertNotNull(error);
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public void test_error_9() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71107);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10qrrux01iv7();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_9",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71107,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10qrrux01iv7() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71107);
        __CLR4_1_101it31it3luszwcmh.R.inc(71108);JSONException error = null;
        __CLR4_1_101it31it3luszwcmh.R.inc(71109);try {
            __CLR4_1_101it31it3luszwcmh.R.inc(71110);String text = "{\"value\":3.2},";
            __CLR4_1_101it31it3luszwcmh.R.inc(71111);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101it31it3luszwcmh.R.inc(71112);error = ex;
        }
        __CLR4_1_101it31it3luszwcmh.R.inc(71113);Assert.assertNotNull(error);
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}
    
    public void test_error_10() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71114);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10y3a9wq1ive();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_10",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71114,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10y3a9wq1ive() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71114);
        __CLR4_1_101it31it3luszwcmh.R.inc(71115);JSONException error = null;
        __CLR4_1_101it31it3luszwcmh.R.inc(71116);try {
            __CLR4_1_101it31it3luszwcmh.R.inc(71117);String text = "{\"value\":3.\\0}";
            __CLR4_1_101it31it3luszwcmh.R.inc(71118);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101it31it3luszwcmh.R.inc(71119);error = ex;
        }
        __CLR4_1_101it31it3luszwcmh.R.inc(71120);Assert.assertNotNull(error);
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}
    
    public void test_error_11() throws Exception {__CLR4_1_101it31it3luszwcmh.R.globalSliceStart(getClass().getName(),71121);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xott9x1ivl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101it31it3luszwcmh.R.rethrow($CLV_t2$);}finally{__CLR4_1_101it31it3luszwcmh.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONScannerTest_scanFieldFloat.test_error_11",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),71121,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xott9x1ivl() throws Exception{try{__CLR4_1_101it31it3luszwcmh.R.inc(71121);
        __CLR4_1_101it31it3luszwcmh.R.inc(71122);JSONException error = null;
        __CLR4_1_101it31it3luszwcmh.R.inc(71123);try {
            __CLR4_1_101it31it3luszwcmh.R.inc(71124);String text = "{\"value\":3.\u4e2d}";
            __CLR4_1_101it31it3luszwcmh.R.inc(71125);JSON.parseObject(text, VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101it31it3luszwcmh.R.inc(71126);error = ex;
        }
        __CLR4_1_101it31it3luszwcmh.R.inc(71127);Assert.assertNotNull(error);
    }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    public static class VO {

        private float value;

        public float getValue() {try{__CLR4_1_101it31it3luszwcmh.R.inc(71128);
            __CLR4_1_101it31it3luszwcmh.R.inc(71129);return value;
        }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

        public void setValue(float value) {try{__CLR4_1_101it31it3luszwcmh.R.inc(71130);
            __CLR4_1_101it31it3luszwcmh.R.inc(71131);this.value = value;
        }finally{__CLR4_1_101it31it3luszwcmh.R.flushNeeded();}}

    }
}
