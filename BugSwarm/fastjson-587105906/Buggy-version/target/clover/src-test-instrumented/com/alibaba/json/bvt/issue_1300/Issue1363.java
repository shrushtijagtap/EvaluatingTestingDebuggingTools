/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.issue_1300;

import com.alibaba.fastjson.JSON;
import junit.framework.TestCase;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenshao on 05/08/2017.
 */
public class Issue1363 extends TestCase {static class __CLR4_1_101a6a1a6alusqk9av{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,59872,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_for_issue() throws Exception {__CLR4_1_101a6a1a6alusqk9av.R.globalSliceStart(getClass().getName(),59842);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10e86tqb1a6a();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101a6a1a6alusqk9av.R.rethrow($CLV_t2$);}finally{__CLR4_1_101a6a1a6alusqk9av.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1363.test_for_issue",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59842,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10e86tqb1a6a() throws Exception{try{__CLR4_1_101a6a1a6alusqk9av.R.inc(59842);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59843);DataSimpleVO a = new DataSimpleVO("a", 1);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59844);DataSimpleVO b = new DataSimpleVO("b", 2);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59845);b.value = a;
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59846);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59847);map.put(a.name, a);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59848);b.value1 = map;

        __CLR4_1_101a6a1a6alusqk9av.R.inc(59849);String jsonStr = JSON.toJSONString(b);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59850);System.out.println(jsonStr);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59851);DataSimpleVO obj = JSON.parseObject(jsonStr, DataSimpleVO.class);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59852);assertEquals(jsonStr, JSON.toJSONString(obj));

    }finally{__CLR4_1_101a6a1a6alusqk9av.R.flushNeeded();}}

    public void test_for_issue_1() throws Exception {__CLR4_1_101a6a1a6alusqk9av.R.globalSliceStart(getClass().getName(),59853);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10uhstn51a6l();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101a6a1a6alusqk9av.R.rethrow($CLV_t2$);}finally{__CLR4_1_101a6a1a6alusqk9av.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.issue_1300.Issue1363.test_for_issue_1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),59853,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10uhstn51a6l() throws Exception{try{__CLR4_1_101a6a1a6alusqk9av.R.inc(59853);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59854);DataSimpleVO a = new DataSimpleVO("a", 1);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59855);DataSimpleVO b = new DataSimpleVO("b", 2);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59856);b.value1 = a;
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59857);Map<String, Object> map = new HashMap<String, Object>();
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59858);map.put(a.name, a);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59859);b.value = map;

        __CLR4_1_101a6a1a6alusqk9av.R.inc(59860);String jsonStr = JSON.toJSONString(b);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59861);System.out.println(jsonStr);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59862);DataSimpleVO obj = JSON.parseObject(jsonStr, DataSimpleVO.class);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59863);System.out.println(obj.toString());
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59864);assertNotNull(obj.value1);
        __CLR4_1_101a6a1a6alusqk9av.R.inc(59865);assertEquals(jsonStr, JSON.toJSONString(obj));
    }finally{__CLR4_1_101a6a1a6alusqk9av.R.flushNeeded();}}

    public static class DataSimpleVO {
        public String name;
        public Object value;
        public Object value1;

        public DataSimpleVO() {try{__CLR4_1_101a6a1a6alusqk9av.R.inc(59866);
        }finally{__CLR4_1_101a6a1a6alusqk9av.R.flushNeeded();}}

        public DataSimpleVO(String name, Object value) {try{__CLR4_1_101a6a1a6alusqk9av.R.inc(59867);
            __CLR4_1_101a6a1a6alusqk9av.R.inc(59868);this.name = name;
            __CLR4_1_101a6a1a6alusqk9av.R.inc(59869);this.value = value;
        }finally{__CLR4_1_101a6a1a6alusqk9av.R.flushNeeded();}}

        @Override
        public String toString() {try{__CLR4_1_101a6a1a6alusqk9av.R.inc(59870);
            __CLR4_1_101a6a1a6alusqk9av.R.inc(59871);return "DataSimpleVO [name=" + name + ", value=" + value + ", value1=" + value1 + "]";
        }finally{__CLR4_1_101a6a1a6alusqk9av.R.flushNeeded();}}

    }
}
