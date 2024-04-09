/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import java.util.List;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.TypeReference;

public class JSONLexerTest_2 extends TestCase {static class __CLR4_5_21heb1heblusvncqf{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,69253,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_0() throws Exception {__CLR4_5_21heb1heblusvncqf.R.globalSliceStart(getClass().getName(),69203);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2n53hp21heb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21heb1heblusvncqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21heb1heblusvncqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_0",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69203,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2n53hp21heb() throws Exception{try{__CLR4_5_21heb1heblusvncqf.R.inc(69203);
        __CLR4_5_21heb1heblusvncqf.R.inc(69204);VO vo = (VO) JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO\"}", VO.class);
        __CLR4_5_21heb1heblusvncqf.R.inc(69205);Assert.assertNotNull(vo);
    }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

    public void test_1() throws Exception {__CLR4_5_21heb1heblusvncqf.R.globalSliceStart(getClass().getName(),69206);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2jw3iwl1hee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21heb1heblusvncqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21heb1heblusvncqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_1",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69206,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2jw3iwl1hee() throws Exception{try{__CLR4_5_21heb1heblusvncqf.R.inc(69206);
        __CLR4_5_21heb1heblusvncqf.R.inc(69207);Exception error = null;
        __CLR4_5_21heb1heblusvncqf.R.inc(69208);try {
            __CLR4_5_21heb1heblusvncqf.R.inc(69209);JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO1\"}", VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21heb1heblusvncqf.R.inc(69210);error = ex;
        }
        __CLR4_5_21heb1heblusvncqf.R.inc(69211);Assert.assertNotNull(error);
    }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

    public void test_2() throws Exception {__CLR4_5_21heb1heblusvncqf.R.globalSliceStart(getClass().getName(),69212);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2gn3k441hek();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21heb1heblusvncqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21heb1heblusvncqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69212,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2gn3k441hek() throws Exception{try{__CLR4_5_21heb1heblusvncqf.R.inc(69212);
        __CLR4_5_21heb1heblusvncqf.R.inc(69213);Exception error = null;
        __CLR4_5_21heb1heblusvncqf.R.inc(69214);try {
            __CLR4_5_21heb1heblusvncqf.R.inc(69215);JSON.parseObject("{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$A\"}", VO.class);
        } catch (JSONException ex) {
            __CLR4_5_21heb1heblusvncqf.R.inc(69216);error = ex;
        }
        __CLR4_5_21heb1heblusvncqf.R.inc(69217);Assert.assertNotNull(error);
    }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

    public void test_a() throws Exception {__CLR4_5_21heb1heblusvncqf.R.globalSliceStart(getClass().getName(),69218);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25yd8w51heq();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21heb1heblusvncqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21heb1heblusvncqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_a",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69218,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25yd8w51heq() throws Exception{try{__CLR4_5_21heb1heblusvncqf.R.inc(69218);
        __CLR4_5_21heb1heblusvncqf.R.inc(69219);P a = JSON.parseObject("{\"vo\":{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO\"}}", P.class);
        __CLR4_5_21heb1heblusvncqf.R.inc(69220);Assert.assertNotNull(a);
    }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

    public void test_list() throws Exception {__CLR4_5_21heb1heblusvncqf.R.globalSliceStart(getClass().getName(),69221);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1het();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21heb1heblusvncqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21heb1heblusvncqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69221,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1het() throws Exception{try{__CLR4_5_21heb1heblusvncqf.R.inc(69221);
        __CLR4_5_21heb1heblusvncqf.R.inc(69222);List<VO> list = JSON.parseObject("[{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO\"}]",
                                         new TypeReference<List<VO>>() {
                                         });
        __CLR4_5_21heb1heblusvncqf.R.inc(69223);Assert.assertNotNull(list);
        __CLR4_5_21heb1heblusvncqf.R.inc(69224);Assert.assertNotNull(list.get(0));
    }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

    public void test_list_2() throws Exception {__CLR4_5_21heb1heblusvncqf.R.globalSliceStart(getClass().getName(),69225);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2r959r91hex();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21heb1heblusvncqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21heb1heblusvncqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_list_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69225,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2r959r91hex() throws Exception{try{__CLR4_5_21heb1heblusvncqf.R.inc(69225);
        __CLR4_5_21heb1heblusvncqf.R.inc(69226);List<VO> list = JSON.parseObject("[{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO\"},{}]",
                                         new TypeReference<List<VO>>() {
                                         });
        __CLR4_5_21heb1heblusvncqf.R.inc(69227);Assert.assertNotNull(list);
        __CLR4_5_21heb1heblusvncqf.R.inc(69228);Assert.assertEquals(2, list.size());
        __CLR4_5_21heb1heblusvncqf.R.inc(69229);Assert.assertNotNull(list.get(0));
        __CLR4_5_21heb1heblusvncqf.R.inc(69230);Assert.assertNotNull(list.get(1));
    }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

    public void test_error() throws Exception {__CLR4_5_21heb1heblusvncqf.R.globalSliceStart(getClass().getName(),69231);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1hf3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21heb1heblusvncqf.R.rethrow($CLV_t2$);}finally{__CLR4_5_21heb1heblusvncqf.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_2.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),69231,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1hf3() throws Exception{try{__CLR4_5_21heb1heblusvncqf.R.inc(69231);
        __CLR4_5_21heb1heblusvncqf.R.inc(69232);Exception error = null;
        __CLR4_5_21heb1heblusvncqf.R.inc(69233);try {
            __CLR4_5_21heb1heblusvncqf.R.inc(69234);JSON.parseObject("[{\"@type\":\"com.alibaba.json.bvt.parser.JSONLexerTest_2$VO\"}[]",
                             new TypeReference<List<VO>>() {
                             });
        } catch (Exception ex) {
            __CLR4_5_21heb1heblusvncqf.R.inc(69235);error = ex;
        }
        __CLR4_5_21heb1heblusvncqf.R.inc(69236);Assert.assertNotNull(error);
    }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

    public static class P {

        private VO vo;

        public VO getVo() {try{__CLR4_5_21heb1heblusvncqf.R.inc(69237);
            __CLR4_5_21heb1heblusvncqf.R.inc(69238);return vo;
        }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

        public void setVo(VO vo) {try{__CLR4_5_21heb1heblusvncqf.R.inc(69239);
            __CLR4_5_21heb1heblusvncqf.R.inc(69240);this.vo = vo;
        }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

    }

    public static class VO {

        private int id;

        public int getId() {try{__CLR4_5_21heb1heblusvncqf.R.inc(69241);
            __CLR4_5_21heb1heblusvncqf.R.inc(69242);return id;
        }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21heb1heblusvncqf.R.inc(69243);
            __CLR4_5_21heb1heblusvncqf.R.inc(69244);this.id = id;
        }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

    }

    public static class VO1 {

        private int id;

        public int getId() {try{__CLR4_5_21heb1heblusvncqf.R.inc(69245);
            __CLR4_5_21heb1heblusvncqf.R.inc(69246);return id;
        }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21heb1heblusvncqf.R.inc(69247);
            __CLR4_5_21heb1heblusvncqf.R.inc(69248);this.id = id;
        }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}
    }

    public static class A {

        private int id;

        public int getId() {try{__CLR4_5_21heb1heblusvncqf.R.inc(69249);
            __CLR4_5_21heb1heblusvncqf.R.inc(69250);return id;
        }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_5_21heb1heblusvncqf.R.inc(69251);
            __CLR4_5_21heb1heblusvncqf.R.inc(69252);this.id = id;
        }finally{__CLR4_5_21heb1heblusvncqf.R.flushNeeded();}}
    }
}
