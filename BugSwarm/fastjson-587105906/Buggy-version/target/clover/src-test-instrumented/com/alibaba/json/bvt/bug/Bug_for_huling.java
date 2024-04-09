/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.bug;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class Bug_for_huling extends TestCase {static class __CLR4_1_1014031403lusqk2rb{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,51883,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_for_0() throws Exception {__CLR4_1_1014031403lusqk2rb.R.globalSliceStart(getClass().getName(),51843);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10h7ak981403();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014031403lusqk2rb.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014031403lusqk2rb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_huling.test_for_0",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51843,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10h7ak981403() throws Exception{try{__CLR4_1_1014031403lusqk2rb.R.inc(51843);
        __CLR4_1_1014031403lusqk2rb.R.inc(51844);VO vo = new VO();
        __CLR4_1_1014031403lusqk2rb.R.inc(51845);vo.setValue("\0\0");
        
        __CLR4_1_1014031403lusqk2rb.R.inc(51846);Assert.assertEquals('\0', vo.getValue().charAt(0));
        
        __CLR4_1_1014031403lusqk2rb.R.inc(51847);String text = JSON.toJSONString(vo);
        __CLR4_1_1014031403lusqk2rb.R.inc(51848);System.out.println(text);
        __CLR4_1_1014031403lusqk2rb.R.inc(51849);Assert.assertEquals("{\"value\":\"\\u0000\\u0000\"}", text);

        __CLR4_1_1014031403lusqk2rb.R.inc(51850);VO vo2 = JSON.parseObject(text, VO.class);
        __CLR4_1_1014031403lusqk2rb.R.inc(51851);Assert.assertEquals("\0\0", vo2.getValue());
    }finally{__CLR4_1_1014031403lusqk2rb.R.flushNeeded();}}
    
    public void test_for_1() throws Exception {__CLR4_1_1014031403lusqk2rb.R.globalSliceStart(getClass().getName(),51852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10dyalgr140c();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014031403lusqk2rb.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014031403lusqk2rb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_huling.test_for_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51852,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10dyalgr140c() throws Exception{try{__CLR4_1_1014031403lusqk2rb.R.inc(51852);
        __CLR4_1_1014031403lusqk2rb.R.inc(51853);VO vo = new VO();
        __CLR4_1_1014031403lusqk2rb.R.inc(51854);vo.setValue("\1\1");
        
        __CLR4_1_1014031403lusqk2rb.R.inc(51855);Assert.assertEquals('\1', vo.getValue().charAt(0));
        
        __CLR4_1_1014031403lusqk2rb.R.inc(51856);String text = JSON.toJSONString(vo);
        __CLR4_1_1014031403lusqk2rb.R.inc(51857);System.out.println(text);
        __CLR4_1_1014031403lusqk2rb.R.inc(51858);Assert.assertEquals("{\"value\":\"\\u0001\\u0001\"}", text);

        __CLR4_1_1014031403lusqk2rb.R.inc(51859);VO vo2 = JSON.parseObject(text, VO.class);
        __CLR4_1_1014031403lusqk2rb.R.inc(51860);Assert.assertEquals("\1\1", vo2.getValue());
    }finally{__CLR4_1_1014031403lusqk2rb.R.flushNeeded();}}
    
    public void test_for_2028() throws Exception {__CLR4_1_1014031403lusqk2rb.R.globalSliceStart(getClass().getName(),51861);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10hrpd5e140l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014031403lusqk2rb.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014031403lusqk2rb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_huling.test_for_2028",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51861,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10hrpd5e140l() throws Exception{try{__CLR4_1_1014031403lusqk2rb.R.inc(51861);
        __CLR4_1_1014031403lusqk2rb.R.inc(51862);VO vo = new VO();
        __CLR4_1_1014031403lusqk2rb.R.inc(51863);vo.setValue("\u2028\u2028");
        
        __CLR4_1_1014031403lusqk2rb.R.inc(51864);Assert.assertEquals('\u2028', vo.getValue().charAt(0));
        
        __CLR4_1_1014031403lusqk2rb.R.inc(51865);String text = JSON.toJSONString(vo);
        __CLR4_1_1014031403lusqk2rb.R.inc(51866);System.out.println(text);
        __CLR4_1_1014031403lusqk2rb.R.inc(51867);Assert.assertEquals("{\"value\":\"\\u2028\\u2028\"}", text);

        __CLR4_1_1014031403lusqk2rb.R.inc(51868);VO vo2 = JSON.parseObject(text, VO.class);
        __CLR4_1_1014031403lusqk2rb.R.inc(51869);Assert.assertEquals("\u2028\u2028", vo2.getValue());
    }finally{__CLR4_1_1014031403lusqk2rb.R.flushNeeded();}}

    public void test_for_2029() throws Exception {__CLR4_1_1014031403lusqk2rb.R.globalSliceStart(getClass().getName(),51870);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10eipecx140u();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1014031403lusqk2rb.R.rethrow($CLV_t2$);}finally{__CLR4_1_1014031403lusqk2rb.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.bug.Bug_for_huling.test_for_2029",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51870,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10eipecx140u() throws Exception{try{__CLR4_1_1014031403lusqk2rb.R.inc(51870);
        __CLR4_1_1014031403lusqk2rb.R.inc(51871);VO vo = new VO();
        __CLR4_1_1014031403lusqk2rb.R.inc(51872);vo.setValue("\u2029\u2029");

        __CLR4_1_1014031403lusqk2rb.R.inc(51873);Assert.assertEquals('\u2029', vo.getValue().charAt(0));

        __CLR4_1_1014031403lusqk2rb.R.inc(51874);String text = JSON.toJSONString(vo);
        __CLR4_1_1014031403lusqk2rb.R.inc(51875);System.out.println(text);
        __CLR4_1_1014031403lusqk2rb.R.inc(51876);Assert.assertEquals("{\"value\":\"\\u2029\\u2029\"}", text);

        __CLR4_1_1014031403lusqk2rb.R.inc(51877);VO vo2 = JSON.parseObject(text, VO.class);
        __CLR4_1_1014031403lusqk2rb.R.inc(51878);Assert.assertEquals("\u2029\u2029", vo2.getValue());
    }finally{__CLR4_1_1014031403lusqk2rb.R.flushNeeded();}}

    public static class VO {

        private String value;

        public String getValue() {try{__CLR4_1_1014031403lusqk2rb.R.inc(51879);
            __CLR4_1_1014031403lusqk2rb.R.inc(51880);return value;
        }finally{__CLR4_1_1014031403lusqk2rb.R.flushNeeded();}}

        public void setValue(String value) {try{__CLR4_1_1014031403lusqk2rb.R.inc(51881);
            __CLR4_1_1014031403lusqk2rb.R.inc(51882);this.value = value;
        }finally{__CLR4_1_1014031403lusqk2rb.R.flushNeeded();}}

    }
}
