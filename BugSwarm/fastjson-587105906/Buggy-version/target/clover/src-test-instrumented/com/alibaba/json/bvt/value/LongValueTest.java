/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.value;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

import junit.framework.TestCase;

public class LongValueTest extends TestCase {static class __CLR4_1_101z0f1z0fluszwgdo{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,92089,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_value() {__CLR4_1_101z0f1z0fluszwgdo.R.globalSliceStart(getClass().getName(),92031);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10z4o0nf1z0f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101z0f1z0fluszwgdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101z0f1z0fluszwgdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.value.LongValueTest.test_value",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92031,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10z4o0nf1z0f(){try{__CLR4_1_101z0f1z0fluszwgdo.R.inc(92031);
        __CLR4_1_101z0f1z0fluszwgdo.R.inc(92032);long step = ((long) Integer.MAX_VALUE) * 1000 * 1000;
        __CLR4_1_101z0f1z0fluszwgdo.R.inc(92033);for (long i = Long.MIN_VALUE; (((i <= 0)&&(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92034)!=0|true))||(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92035)==0&false)); i += step) {{
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92036);VO vo = new VO();
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92037);vo.value = i;
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92038);String text = JSON.toJSONString(vo);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92039);VO vo2 = JSON.parseObject(text, VO.class);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92040);Assert.assertEquals(vo.value, vo2.value);
        }
        }__CLR4_1_101z0f1z0fluszwgdo.R.inc(92041);for (long i = Long.MAX_VALUE; (((i >= 0)&&(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92042)!=0|true))||(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92043)==0&false)); i -= step) {{
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92044);VO vo = new VO();
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92045);vo.value = i;
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92046);String text = JSON.toJSONString(vo);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92047);VO vo2 = JSON.parseObject(text, VO.class);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92048);Assert.assertEquals(vo.value, vo2.value);
        }
    }}finally{__CLR4_1_101z0f1z0fluszwgdo.R.flushNeeded();}}

    public void test_value_1() {__CLR4_1_101z0f1z0fluszwgdo.R.globalSliceStart(getClass().getName(),92049);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10o3fl4t1z0x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101z0f1z0fluszwgdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101z0f1z0fluszwgdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.value.LongValueTest.test_value_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92049,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10o3fl4t1z0x(){try{__CLR4_1_101z0f1z0fluszwgdo.R.inc(92049);
        __CLR4_1_101z0f1z0fluszwgdo.R.inc(92050);long step = ((long) Integer.MAX_VALUE) * 1000 * 1000;
        __CLR4_1_101z0f1z0fluszwgdo.R.inc(92051);for (long i = Long.MIN_VALUE; (((i <= 0)&&(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92052)!=0|true))||(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92053)==0&false)); i += step) {{
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92054);V1 vo = new V1();
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92055);vo.value = i;
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92056);String text = JSON.toJSONString(vo);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92057);V1 vo2 = JSON.parseObject(text, V1.class);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92058);Assert.assertEquals(vo.value, vo2.value);
        }
        }__CLR4_1_101z0f1z0fluszwgdo.R.inc(92059);for (long i = Long.MAX_VALUE; (((i >= 0)&&(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92060)!=0|true))||(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92061)==0&false)); i -= step) {{
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92062);V1 vo = new V1();
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92063);vo.value = i;
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92064);String text = JSON.toJSONString(vo);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92065);V1 vo2 = JSON.parseObject(text, V1.class);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92066);Assert.assertEquals(vo.value, vo2.value);
        }
    }}finally{__CLR4_1_101z0f1z0fluszwgdo.R.flushNeeded();}}
    
    public void test_value_2() {__CLR4_1_101z0f1z0fluszwgdo.R.globalSliceStart(getClass().getName(),92067);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rcfjxa1z1f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101z0f1z0fluszwgdo.R.rethrow($CLV_t2$);}finally{__CLR4_1_101z0f1z0fluszwgdo.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.value.LongValueTest.test_value_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),92067,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rcfjxa1z1f(){try{__CLR4_1_101z0f1z0fluszwgdo.R.inc(92067);
        __CLR4_1_101z0f1z0fluszwgdo.R.inc(92068);long step = ((long) Integer.MAX_VALUE) * 1000 * 1000;
        __CLR4_1_101z0f1z0fluszwgdo.R.inc(92069);for (long i = Long.MIN_VALUE; (((i <= 0)&&(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92070)!=0|true))||(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92071)==0&false)); i += step) {{
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92072);V2 vo = new V2();
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92073);vo.value = i;
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92074);String text = JSON.toJSONString(vo);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92075);V2 vo2 = JSON.parseObject(text, V2.class);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92076);Assert.assertEquals(vo.value, vo2.value);
        }
        }__CLR4_1_101z0f1z0fluszwgdo.R.inc(92077);for (long i = Long.MAX_VALUE; (((i >= 0)&&(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92078)!=0|true))||(__CLR4_1_101z0f1z0fluszwgdo.R.iget(92079)==0&false)); i -= step) {{
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92080);V2 vo = new V2();
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92081);vo.value = i;
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92082);String text = JSON.toJSONString(vo);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92083);V2 vo2 = JSON.parseObject(text, V2.class);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92084);Assert.assertEquals(vo.value, vo2.value);
        }
    }}finally{__CLR4_1_101z0f1z0fluszwgdo.R.flushNeeded();}}

    public static class VO {

        public long value;
    }

    static class V1 {

        public long value;
    }

    public static class V2 {

        private long value;

        public long getValue() {try{__CLR4_1_101z0f1z0fluszwgdo.R.inc(92085);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92086);return value;
        }finally{__CLR4_1_101z0f1z0fluszwgdo.R.flushNeeded();}}

        public void setValue(long value) {try{__CLR4_1_101z0f1z0fluszwgdo.R.inc(92087);
            __CLR4_1_101z0f1z0fluszwgdo.R.inc(92088);this.value = value;
        }finally{__CLR4_1_101z0f1z0fluszwgdo.R.flushNeeded();}}

    }
}
