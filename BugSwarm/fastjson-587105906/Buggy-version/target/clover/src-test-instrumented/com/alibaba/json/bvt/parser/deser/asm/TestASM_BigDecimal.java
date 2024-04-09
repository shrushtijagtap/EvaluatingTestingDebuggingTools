/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.parser.deser.asm;

import java.math.BigDecimal;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class TestASM_BigDecimal extends TestCase {static class __CLR4_1_101ltx1ltxlusqkgky{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,74981,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_decimal() throws Exception {__CLR4_1_101ltx1ltxlusqkgky.R.globalSliceStart(getClass().getName(),74949);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10f2trhn1ltx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ltx1ltxlusqkgky.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ltx1ltxlusqkgky.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM_BigDecimal.test_decimal",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74949,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10f2trhn1ltx() throws Exception{try{__CLR4_1_101ltx1ltxlusqkgky.R.inc(74949);
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74950);V0 v = new V0();
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74951);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74952);Assert.assertEquals("{}", text);
    }finally{__CLR4_1_101ltx1ltxlusqkgky.R.flushNeeded();}}

    public void test_decimal_1() throws Exception {__CLR4_1_101ltx1ltxlusqkgky.R.globalSliceStart(getClass().getName(),74953);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_104cbx7h1lu1();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ltx1ltxlusqkgky.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ltx1ltxlusqkgky.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM_BigDecimal.test_decimal_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74953,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_104cbx7h1lu1() throws Exception{try{__CLR4_1_101ltx1ltxlusqkgky.R.inc(74953);
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74954);V0 v = new V0();
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74955);v.setDecimal(new BigDecimal("123"));
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74956);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74957);Assert.assertEquals("{'decimal':123}", text);
    }finally{__CLR4_1_101ltx1ltxlusqkgky.R.flushNeeded();}}
    

    public void test_decimal_2() throws Exception {__CLR4_1_101ltx1ltxlusqkgky.R.globalSliceStart(getClass().getName(),74958);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_107lbvzy1lu6();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ltx1ltxlusqkgky.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ltx1ltxlusqkgky.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM_BigDecimal.test_decimal_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74958,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_107lbvzy1lu6() throws Exception{try{__CLR4_1_101ltx1ltxlusqkgky.R.inc(74958);
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74959);V1 v = new V1();
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74960);v.setId(123);
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74961);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes);

        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74962);Assert.assertEquals("{'id':123}", text);
    }finally{__CLR4_1_101ltx1ltxlusqkgky.R.flushNeeded();}}
    
    public void test_decimal_3() throws Exception {__CLR4_1_101ltx1ltxlusqkgky.R.globalSliceStart(getClass().getName(),74963);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10aubusf1lub();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101ltx1ltxlusqkgky.R.rethrow($CLV_t2$);}finally{__CLR4_1_101ltx1ltxlusqkgky.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.parser.deser.asm.TestASM_BigDecimal.test_decimal_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),74963,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10aubusf1lub() throws Exception{try{__CLR4_1_101ltx1ltxlusqkgky.R.inc(74963);
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74964);V1 v = new V1();
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74965);v.setId(123);
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74966);String text = JSON.toJSONString(v, SerializerFeature.UseSingleQuotes, SerializerFeature.WriteMapNullValue);
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74967);System.out.println(text);
        
        __CLR4_1_101ltx1ltxlusqkgky.R.inc(74968);Assert.assertEquals("{'decimal':null,'id':123}", text);
    }finally{__CLR4_1_101ltx1ltxlusqkgky.R.flushNeeded();}}

    public static class V0 {

        private BigDecimal decimal;

        public BigDecimal getDecimal() {try{__CLR4_1_101ltx1ltxlusqkgky.R.inc(74969);
            __CLR4_1_101ltx1ltxlusqkgky.R.inc(74970);return decimal;
        }finally{__CLR4_1_101ltx1ltxlusqkgky.R.flushNeeded();}}

        public void setDecimal(BigDecimal decimal) {try{__CLR4_1_101ltx1ltxlusqkgky.R.inc(74971);
            __CLR4_1_101ltx1ltxlusqkgky.R.inc(74972);this.decimal = decimal;
        }finally{__CLR4_1_101ltx1ltxlusqkgky.R.flushNeeded();}}

    }

    public static class V1 {

        private int        id;
        private BigDecimal decimal;

        public int getId() {try{__CLR4_1_101ltx1ltxlusqkgky.R.inc(74973);
            __CLR4_1_101ltx1ltxlusqkgky.R.inc(74974);return id;
        }finally{__CLR4_1_101ltx1ltxlusqkgky.R.flushNeeded();}}

        public void setId(int id) {try{__CLR4_1_101ltx1ltxlusqkgky.R.inc(74975);
            __CLR4_1_101ltx1ltxlusqkgky.R.inc(74976);this.id = id;
        }finally{__CLR4_1_101ltx1ltxlusqkgky.R.flushNeeded();}}

        public BigDecimal getDecimal() {try{__CLR4_1_101ltx1ltxlusqkgky.R.inc(74977);
            __CLR4_1_101ltx1ltxlusqkgky.R.inc(74978);return decimal;
        }finally{__CLR4_1_101ltx1ltxlusqkgky.R.flushNeeded();}}

        public void setDecimal(BigDecimal decimal) {try{__CLR4_1_101ltx1ltxlusqkgky.R.inc(74979);
            __CLR4_1_101ltx1ltxlusqkgky.R.inc(74980);this.decimal = decimal;
        }finally{__CLR4_1_101ltx1ltxlusqkgky.R.flushNeeded();}}

    }
}
