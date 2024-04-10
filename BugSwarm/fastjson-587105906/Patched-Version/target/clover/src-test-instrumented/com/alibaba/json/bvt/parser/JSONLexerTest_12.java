/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.parser;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class JSONLexerTest_12 extends TestCase {static class __CLR4_5_21gd51gd5lusyjtmg{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,67894,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_error() throws Exception {__CLR4_5_21gd51gd5lusyjtmg.R.globalSliceStart(getClass().getName(),67865);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2vbot1a1gd5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gd51gd5lusyjtmg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gd51gd5lusyjtmg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_12.test_error",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67865,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2vbot1a1gd5() throws Exception{try{__CLR4_5_21gd51gd5lusyjtmg.R.inc(67865);
        __CLR4_5_21gd51gd5lusyjtmg.R.inc(67866);Exception error = null;
        __CLR4_5_21gd51gd5lusyjtmg.R.inc(67867);try {
            __CLR4_5_21gd51gd5lusyjtmg.R.inc(67868);JSON.parseObject("{\"type\":92233720368547758071}", VO.class);
        } catch (Exception ex) {
            __CLR4_5_21gd51gd5lusyjtmg.R.inc(67869);error = ex;
        }
        __CLR4_5_21gd51gd5lusyjtmg.R.inc(67870);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gd51gd5lusyjtmg.R.flushNeeded();}}

    public void test_a() throws Exception {__CLR4_5_21gd51gd5lusyjtmg.R.globalSliceStart(getClass().getName(),67871);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_25yd8w51gdb();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gd51gd5lusyjtmg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gd51gd5lusyjtmg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_12.test_a",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67871,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_25yd8w51gdb() throws Exception{try{__CLR4_5_21gd51gd5lusyjtmg.R.inc(67871);
        __CLR4_5_21gd51gd5lusyjtmg.R.inc(67872);Assert.assertEquals(123L, JSON.parseObject("{\"vo\":{\"type\":123}}", A.class).getVo().getType());
    }finally{__CLR4_5_21gd51gd5lusyjtmg.R.flushNeeded();}}
    
    public void test_error_2() throws Exception {__CLR4_5_21gd51gd5lusyjtmg.R.globalSliceStart(getClass().getName(),67873);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2licfit1gdd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gd51gd5lusyjtmg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gd51gd5lusyjtmg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_12.test_error_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67873,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2licfit1gdd() throws Exception{try{__CLR4_5_21gd51gd5lusyjtmg.R.inc(67873);
        __CLR4_5_21gd51gd5lusyjtmg.R.inc(67874);Exception error = null;
        __CLR4_5_21gd51gd5lusyjtmg.R.inc(67875);try {
            __CLR4_5_21gd51gd5lusyjtmg.R.inc(67876);JSON.parseObject("{\"vo\":{\"type\":123}[", A.class);
        } catch (Exception ex) {
            __CLR4_5_21gd51gd5lusyjtmg.R.inc(67877);error = ex;
        }
        __CLR4_5_21gd51gd5lusyjtmg.R.inc(67878);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gd51gd5lusyjtmg.R.flushNeeded();}}
    
    public void test_error_3() throws Exception {__CLR4_5_21gd51gd5lusyjtmg.R.globalSliceStart(getClass().getName(),67879);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2orceba1gdj();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21gd51gd5lusyjtmg.R.rethrow($CLV_t2$);}finally{__CLR4_5_21gd51gd5lusyjtmg.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.JSONLexerTest_12.test_error_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),67879,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2orceba1gdj() throws Exception{try{__CLR4_5_21gd51gd5lusyjtmg.R.inc(67879);
        __CLR4_5_21gd51gd5lusyjtmg.R.inc(67880);Exception error = null;
        __CLR4_5_21gd51gd5lusyjtmg.R.inc(67881);try {
            __CLR4_5_21gd51gd5lusyjtmg.R.inc(67882);JSON.parseObject("{\"vo\":{\"type\":123]", A.class);
        } catch (Exception ex) {
            __CLR4_5_21gd51gd5lusyjtmg.R.inc(67883);error = ex;
        }
        __CLR4_5_21gd51gd5lusyjtmg.R.inc(67884);Assert.assertNotNull(error);
    }finally{__CLR4_5_21gd51gd5lusyjtmg.R.flushNeeded();}}

    public static class A {

        private VO vo;

        public VO getVo() {try{__CLR4_5_21gd51gd5lusyjtmg.R.inc(67885);
            __CLR4_5_21gd51gd5lusyjtmg.R.inc(67886);return vo;
        }finally{__CLR4_5_21gd51gd5lusyjtmg.R.flushNeeded();}}

        public void setVo(VO vo) {try{__CLR4_5_21gd51gd5lusyjtmg.R.inc(67887);
            __CLR4_5_21gd51gd5lusyjtmg.R.inc(67888);this.vo = vo;
        }finally{__CLR4_5_21gd51gd5lusyjtmg.R.flushNeeded();}}

    }

    public static class VO {

        public VO(){try{__CLR4_5_21gd51gd5lusyjtmg.R.inc(67889);

        }finally{__CLR4_5_21gd51gd5lusyjtmg.R.flushNeeded();}}

        private long type;

        public long getType() {try{__CLR4_5_21gd51gd5lusyjtmg.R.inc(67890);
            __CLR4_5_21gd51gd5lusyjtmg.R.inc(67891);return type;
        }finally{__CLR4_5_21gd51gd5lusyjtmg.R.flushNeeded();}}

        public void setType(long type) {try{__CLR4_5_21gd51gd5lusyjtmg.R.inc(67892);
            __CLR4_5_21gd51gd5lusyjtmg.R.inc(67893);this.type = type;
        }finally{__CLR4_5_21gd51gd5lusyjtmg.R.flushNeeded();}}

    }
}
