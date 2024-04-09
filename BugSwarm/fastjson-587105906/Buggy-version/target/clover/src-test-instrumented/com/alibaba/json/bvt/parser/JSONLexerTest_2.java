/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;

public class JSONLexerTest_2 extends TestCase {static class __CLR4_1_101gge1ggelusqkda4{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,68032,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_1_101gge1ggelusqkda4.R.globalSliceStart(getClass().getName(),67982);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10n53hp21gge();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gge1ggelusqkda4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gge1ggelusqkda4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67982,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10n53hp21gge() throws Exception{try{__CLR4_1_101gge1ggelusqkda4.R.inc(67982);
        __CLR4_1_101gge1ggelusqkda4.R.inc(67983);VO vo = (VO) JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO\"}", VO.class);
        __CLR4_1_101gge1ggelusqkda4.R.inc(67984);Assert.assertNotNull(vo);
    }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_1_101gge1ggelusqkda4.R.globalSliceStart(getClass().getName(),67985);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10jw3iwl1ggh();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gge1ggelusqkda4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gge1ggelusqkda4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67985,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10jw3iwl1ggh() throws Exception{try{__CLR4_1_101gge1ggelusqkda4.R.inc(67985);
        __CLR4_1_101gge1ggelusqkda4.R.inc(67986);Exception error = null;
        __CLR4_1_101gge1ggelusqkda4.R.inc(67987);try {
            __CLR4_1_101gge1ggelusqkda4.R.inc(67988);JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO1\"}", VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101gge1ggelusqkda4.R.inc(67989);error = ex;
        }
        __CLR4_1_101gge1ggelusqkda4.R.inc(67990);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_1_101gge1ggelusqkda4.R.globalSliceStart(getClass().getName(),67991);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10gn3k441ggn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gge1ggelusqkda4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gge1ggelusqkda4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67991,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10gn3k441ggn() throws Exception{try{__CLR4_1_101gge1ggelusqkda4.R.inc(67991);
        __CLR4_1_101gge1ggelusqkda4.R.inc(67992);Exception error = null;
        __CLR4_1_101gge1ggelusqkda4.R.inc(67993);try {
            __CLR4_1_101gge1ggelusqkda4.R.inc(67994);JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$A\"}", VO.class);
        } catch (JSONException ex) {
            __CLR4_1_101gge1ggelusqkda4.R.inc(67995);error = ex;
        }
        __CLR4_1_101gge1ggelusqkda4.R.inc(67996);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

    public void test_a() throws Exception {__CLR4_1_101gge1ggelusqkda4.R.globalSliceStart(getClass().getName(),67997);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_105yd8w51ggt();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gge1ggelusqkda4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gge1ggelusqkda4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_a",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67997,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_105yd8w51ggt() throws Exception{try{__CLR4_1_101gge1ggelusqkda4.R.inc(67997);
        __CLR4_1_101gge1ggelusqkda4.R.inc(67998);P a = JSON.parseObject("{\"vo\":{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO\"}}", P.class);
        __CLR4_1_101gge1ggelusqkda4.R.inc(67999);Assert.assertNotNull(a);
    }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

    public void test_list() throws Exception {__CLR4_1_101gge1ggelusqkda4.R.globalSliceStart(getClass().getName(),68000);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_1059ny8i1ggw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gge1ggelusqkda4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gge1ggelusqkda4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_list",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68000,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_1059ny8i1ggw() throws Exception{try{__CLR4_1_101gge1ggelusqkda4.R.inc(68000);
        __CLR4_1_101gge1ggelusqkda4.R.inc(68001);List<VO> list = JSON.parseObject("[{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO\"}]",
                                         new TypeReference<List<VO>>() {
                                         });
        __CLR4_1_101gge1ggelusqkda4.R.inc(68002);Assert.assertNotNull(list);
        __CLR4_1_101gge1ggelusqkda4.R.inc(68003);Assert.assertNotNull(list.get(0));
    }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

    public void test_list_2() throws Exception {__CLR4_1_101gge1ggelusqkda4.R.globalSliceStart(getClass().getName(),68004);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10r959r91gh0();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gge1ggelusqkda4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gge1ggelusqkda4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_list_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68004,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10r959r91gh0() throws Exception{try{__CLR4_1_101gge1ggelusqkda4.R.inc(68004);
        __CLR4_1_101gge1ggelusqkda4.R.inc(68005);List<VO> list = JSON.parseObject("[{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO\"},{}]",
                                         new TypeReference<List<VO>>() {
                                         });
        __CLR4_1_101gge1ggelusqkda4.R.inc(68006);Assert.assertNotNull(list);
        __CLR4_1_101gge1ggelusqkda4.R.inc(68007);Assert.assertEquals(2, list.size());
        __CLR4_1_101gge1ggelusqkda4.R.inc(68008);Assert.assertNotNull(list.get(0));
        __CLR4_1_101gge1ggelusqkda4.R.inc(68009);Assert.assertNotNull(list.get(1));
    }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_1_101gge1ggelusqkda4.R.globalSliceStart(getClass().getName(),68010);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vbot1a1gh6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101gge1ggelusqkda4.R.rethrow($CLV_t2$);}finally{__CLR4_1_101gge1ggelusqkda4.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_error",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),68010,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vbot1a1gh6() throws Exception{try{__CLR4_1_101gge1ggelusqkda4.R.inc(68010);
        __CLR4_1_101gge1ggelusqkda4.R.inc(68011);Exception error = null;
        __CLR4_1_101gge1ggelusqkda4.R.inc(68012);try {
            __CLR4_1_101gge1ggelusqkda4.R.inc(68013);JSON.parseObject("[{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO\"}[]",
                             new TypeReference<List<VO>>() {
                             });
        } catch (Exception ex) {
            __CLR4_1_101gge1ggelusqkda4.R.inc(68014);error = ex;
        }
        __CLR4_1_101gge1ggelusqkda4.R.inc(68015);Assert.assertNotNull(error);
    }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

    public static class P {

        private VO vo;

        public VO getVo() {try{__CLR4_1_101gge1ggelusqkda4.R.inc(68016);
            __CLR4_1_101gge1ggelusqkda4.R.inc(68017);return vo;
        }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

        public void setVo(VO vo) {try{__CLR4_1_101gge1ggelusqkda4.R.inc(68018);
            __CLR4_1_101gge1ggelusqkda4.R.inc(68019);this.vo = vo;
        }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

    }

    public static class VO {

        private int id;

        public int getId() {try{__CLR4_1_101gge1ggelusqkda4.R.inc(68020);
            __CLR4_1_101gge1ggelusqkda4.R.inc(68021);return id;
        }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101gge1ggelusqkda4.R.inc(68022);
            __CLR4_1_101gge1ggelusqkda4.R.inc(68023);this.id = id;
        }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

    }

    public static class VO1 {

        private int id;

        public int getId() {try{__CLR4_1_101gge1ggelusqkda4.R.inc(68024);
            __CLR4_1_101gge1ggelusqkda4.R.inc(68025);return id;
        }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101gge1ggelusqkda4.R.inc(68026);
            __CLR4_1_101gge1ggelusqkda4.R.inc(68027);this.id = id;
        }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}
    }

    public static class A {

        private int id;

        public int getId() {try{__CLR4_1_101gge1ggelusqkda4.R.inc(68028);
            __CLR4_1_101gge1ggelusqkda4.R.inc(68029);return id;
        }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101gge1ggelusqkda4.R.inc(68030);
            __CLR4_1_101gge1ggelusqkda4.R.inc(68031);this.id = id;
        }finally{__CLR4_1_101gge1ggelusqkda4.R.flushNeeded();}}
    }
}
