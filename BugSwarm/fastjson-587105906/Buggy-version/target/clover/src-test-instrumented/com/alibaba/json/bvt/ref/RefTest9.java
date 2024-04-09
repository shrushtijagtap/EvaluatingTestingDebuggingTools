/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.ref;

import java.util.HashSet;
import java.util.Set;

import junit.framework.TestCase;

import org.junit.Assert;

import com.alibaba.fastjson.JSON;

public class RefTest9 extends TestCase {static class __CLR4_1_101qdk1qdklusqkj32{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,80856,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    public void test_bug_for_wanglin() throws Exception {__CLR4_1_101qdk1qdklusqkj32.R.globalSliceStart(getClass().getName(),80840);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10z2tf951qdk();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101qdk1qdklusqkj32.R.rethrow($CLV_t2$);}finally{__CLR4_1_101qdk1qdklusqkj32.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.ref.RefTest9.test_bug_for_wanglin",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),80840,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10z2tf951qdk() throws Exception{try{__CLR4_1_101qdk1qdklusqkj32.R.inc(80840);
        __CLR4_1_101qdk1qdklusqkj32.R.inc(80841);VO vo = new VO();
        __CLR4_1_101qdk1qdklusqkj32.R.inc(80842);A a = new A();
        __CLR4_1_101qdk1qdklusqkj32.R.inc(80843);vo.setA(a);
        __CLR4_1_101qdk1qdklusqkj32.R.inc(80844);vo.getValues().add(a);

        __CLR4_1_101qdk1qdklusqkj32.R.inc(80845);String text = JSON.toJSONString(vo);
        __CLR4_1_101qdk1qdklusqkj32.R.inc(80846);Assert.assertEquals("{\"a\":{},\"values\":[{\"$ref\":\"$.a\"}]}", text);
        
        __CLR4_1_101qdk1qdklusqkj32.R.inc(80847);VO vo2 = JSON.parseObject(text, VO.class);
    }finally{__CLR4_1_101qdk1qdklusqkj32.R.flushNeeded();}}

    public static class VO {

        private A      a;
        private Set<A> values = new HashSet<A>();

        public A getA() {try{__CLR4_1_101qdk1qdklusqkj32.R.inc(80848);
            __CLR4_1_101qdk1qdklusqkj32.R.inc(80849);return a;
        }finally{__CLR4_1_101qdk1qdklusqkj32.R.flushNeeded();}}

        public void setA(A a) {try{__CLR4_1_101qdk1qdklusqkj32.R.inc(80850);
            __CLR4_1_101qdk1qdklusqkj32.R.inc(80851);this.a = a;
        }finally{__CLR4_1_101qdk1qdklusqkj32.R.flushNeeded();}}

        public Set<A> getValues() {try{__CLR4_1_101qdk1qdklusqkj32.R.inc(80852);
            __CLR4_1_101qdk1qdklusqkj32.R.inc(80853);return values;
        }finally{__CLR4_1_101qdk1qdklusqkj32.R.flushNeeded();}}

        public void setValues(Set<A> values) {try{__CLR4_1_101qdk1qdklusqkj32.R.inc(80854);
            __CLR4_1_101qdk1qdklusqkj32.R.inc(80855);this.values = values;
        }finally{__CLR4_1_101qdk1qdklusqkj32.R.flushNeeded();}}

    }

    public static class A {

    }
}
