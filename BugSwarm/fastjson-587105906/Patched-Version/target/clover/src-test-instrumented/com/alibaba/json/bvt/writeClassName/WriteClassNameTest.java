/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.writeClassName;

import org.junit.Assert;
import junit.framework.TestCase;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;

public class WriteClassNameTest extends TestCase {static class __CLR4_5_21zr21zr2lusvnifn{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,93004,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;

    protected void setUp() throws Exception {try{__CLR4_5_21zr21zr2lusvnifn.R.inc(92990);
        __CLR4_5_21zr21zr2lusvnifn.R.inc(92991);com.alibaba.fastjson.parser.ParserConfig.getGlobalInstance().addAccept(this.getClass().getName() + ".");
    }finally{__CLR4_5_21zr21zr2lusvnifn.R.flushNeeded();}}

    public void test_list() throws Exception {__CLR4_5_21zr21zr2lusvnifn.R.globalSliceStart(getClass().getName(),92992);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_259ny8i1zr4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_21zr21zr2lusvnifn.R.rethrow($CLV_t2$);}finally{__CLR4_5_21zr21zr2lusvnifn.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.writeClassName.WriteClassNameTest.test_list",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),92992,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_259ny8i1zr4() throws Exception{try{__CLR4_5_21zr21zr2lusvnifn.R.inc(92992);
        __CLR4_5_21zr21zr2lusvnifn.R.inc(92993);A a = new A();
        __CLR4_5_21zr21zr2lusvnifn.R.inc(92994);a.setB(new B());
        __CLR4_5_21zr21zr2lusvnifn.R.inc(92995);String text = JSON.toJSONString(a, SerializerFeature.WriteClassName);
        __CLR4_5_21zr21zr2lusvnifn.R.inc(92996);System.out.println(text);
        __CLR4_5_21zr21zr2lusvnifn.R.inc(92997);Assert.assertEquals("{\"@type\":\"com.alibaba.json.bvt.writeClassName.WriteClassNameTest$A\",\"b\":{}}", text);
        
        __CLR4_5_21zr21zr2lusvnifn.R.inc(92998);A a1 = (A) JSON.parse(text);
        
        __CLR4_5_21zr21zr2lusvnifn.R.inc(92999);Assert.assertNotNull(a1.getB());
    }finally{__CLR4_5_21zr21zr2lusvnifn.R.flushNeeded();}}

    private static class A {

        private B b;

        public B getB() {try{__CLR4_5_21zr21zr2lusvnifn.R.inc(93000);
            __CLR4_5_21zr21zr2lusvnifn.R.inc(93001);return b;
        }finally{__CLR4_5_21zr21zr2lusvnifn.R.flushNeeded();}}

        public void setB(B b) {try{__CLR4_5_21zr21zr2lusvnifn.R.inc(93002);
            __CLR4_5_21zr21zr2lusvnifn.R.inc(93003);this.b = b;
        }finally{__CLR4_5_21zr21zr2lusvnifn.R.flushNeeded();}}

    }

    private static final class B {
        
    }
}
