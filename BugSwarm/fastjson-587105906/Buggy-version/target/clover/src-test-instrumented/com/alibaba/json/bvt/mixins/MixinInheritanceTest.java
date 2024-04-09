/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.mixins;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;
import org.junit.Assert;

public class MixinInheritanceTest extends TestCase {static class __CLR4_1_101esb1esblusqkcki{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,65858,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    static class Beano {
        public int ido = 42;
        public String nameo = "Bob";
    }

    static class BeanoMixinSuper {
        @JSONField(name = "name")
        public String nameo;
    }

    static class BeanoMixinSub extends BeanoMixinSuper {
        @JSONField(name = "id")
        public int ido;
    }

    static class Beano2 {
        public int getIdo() {try{__CLR4_1_101esb1esblusqkcki.R.inc(65819); __CLR4_1_101esb1esblusqkcki.R.inc(65820);return 13; }finally{__CLR4_1_101esb1esblusqkcki.R.flushNeeded();}}
        public String getNameo() {try{__CLR4_1_101esb1esblusqkcki.R.inc(65821); __CLR4_1_101esb1esblusqkcki.R.inc(65822);return "Bill"; }finally{__CLR4_1_101esb1esblusqkcki.R.flushNeeded();}}
    }

    static abstract class BeanoMixinSuper2 extends Beano2 {
        @Override
        @JSONField(name = "name")
        public abstract String getNameo();
    }

    static abstract class BeanoMixinSub2 extends BeanoMixinSuper2 {
        @Override
        @JSONField(name = "id")
        public abstract int getIdo();
    }

    public void test_field() throws Exception {__CLR4_1_101esb1esblusqkcki.R.globalSliceStart(getClass().getName(),65823);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vh3vws1esf();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101esb1esblusqkcki.R.rethrow($CLV_t2$);}finally{__CLR4_1_101esb1esblusqkcki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinInheritanceTest.test_field",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65823,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vh3vws1esf() throws Exception{try{__CLR4_1_101esb1esblusqkcki.R.inc(65823);
        __CLR4_1_101esb1esblusqkcki.R.inc(65824);JSON.addMixInAnnotations(Beano.class, BeanoMixinSub.class);
        __CLR4_1_101esb1esblusqkcki.R.inc(65825);String str = JSON.toJSONString(new Beano());
        __CLR4_1_101esb1esblusqkcki.R.inc(65826);JSONObject result = JSONObject.parseObject(str);
        __CLR4_1_101esb1esblusqkcki.R.inc(65827);assertEquals(2, result.size());
        __CLR4_1_101esb1esblusqkcki.R.inc(65828);if ((((!result.containsKey("id")
                || !result.containsKey("name"))&&(__CLR4_1_101esb1esblusqkcki.R.iget(65829)!=0|true))||(__CLR4_1_101esb1esblusqkcki.R.iget(65830)==0&false))) {{
            __CLR4_1_101esb1esblusqkcki.R.inc(65831);fail("Should have both 'id' and 'name', but content = " + result);
        }
        }__CLR4_1_101esb1esblusqkcki.R.inc(65832);JSON.removeMixInAnnotations(Beano.class);
    }finally{__CLR4_1_101esb1esblusqkcki.R.flushNeeded();}}

    public void test_method() throws Exception {__CLR4_1_101esb1esblusqkcki.R.globalSliceStart(getClass().getName(),65833);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101xt2rv1esp();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101esb1esblusqkcki.R.rethrow($CLV_t2$);}finally{__CLR4_1_101esb1esblusqkcki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinInheritanceTest.test_method",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65833,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101xt2rv1esp() throws Exception{try{__CLR4_1_101esb1esblusqkcki.R.inc(65833);
        __CLR4_1_101esb1esblusqkcki.R.inc(65834);JSON.addMixInAnnotations(Beano2.class, BeanoMixinSub2.class);
        __CLR4_1_101esb1esblusqkcki.R.inc(65835);String str = JSON.toJSONString(new Beano2());
        __CLR4_1_101esb1esblusqkcki.R.inc(65836);JSONObject result = JSONObject.parseObject(str);
        __CLR4_1_101esb1esblusqkcki.R.inc(65837);assertEquals(2, result.size());
        __CLR4_1_101esb1esblusqkcki.R.inc(65838);assertTrue(result.containsKey("id"));
        __CLR4_1_101esb1esblusqkcki.R.inc(65839);assertTrue(result.containsKey("name"));
        __CLR4_1_101esb1esblusqkcki.R.inc(65840);JSON.removeMixInAnnotations(Beano2.class);
    }finally{__CLR4_1_101esb1esblusqkcki.R.flushNeeded();}}

    static class BaseClass {
        public int a;
        public int b;
        public int c;

        public  BaseClass() {try{__CLR4_1_101esb1esblusqkcki.R.inc(65841);

        }finally{__CLR4_1_101esb1esblusqkcki.R.flushNeeded();}}
        public BaseClass(int a, int b,int c) {try{__CLR4_1_101esb1esblusqkcki.R.inc(65842);
            __CLR4_1_101esb1esblusqkcki.R.inc(65843);this.a = a;
            __CLR4_1_101esb1esblusqkcki.R.inc(65844);this.b = b;
            __CLR4_1_101esb1esblusqkcki.R.inc(65845);this.c = c;
        }finally{__CLR4_1_101esb1esblusqkcki.R.flushNeeded();}}
    }

    class BaseMixIn {
        @JSONField(name = "apple")
        public int a;
        @JSONField(name = "banana")
        public int b;
    }

    class SubMixIn extends BaseMixIn {
        @JSONField(name = "pear")
        public int c;
    }

    class SubMixIn1 extends SubMixIn {
        @JSONField(name = "watermelon")
        public int b;
    }

    public void test_mixIn_extend() throws Exception {__CLR4_1_101esb1esblusqkcki.R.globalSliceStart(getClass().getName(),65846);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tq9igc1et2();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101esb1esblusqkcki.R.rethrow($CLV_t2$);}finally{__CLR4_1_101esb1esblusqkcki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinInheritanceTest.test_mixIn_extend",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65846,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tq9igc1et2() throws Exception{try{__CLR4_1_101esb1esblusqkcki.R.inc(65846);
        __CLR4_1_101esb1esblusqkcki.R.inc(65847);BaseClass base = new BaseClass(1, 2,3);
        __CLR4_1_101esb1esblusqkcki.R.inc(65848);Assert.assertEquals("{\"a\":1,\"b\":2,\"c\":3}", JSON.toJSONString(base));

        __CLR4_1_101esb1esblusqkcki.R.inc(65849);JSON.addMixInAnnotations(BaseClass.class, SubMixIn.class);
        __CLR4_1_101esb1esblusqkcki.R.inc(65850);Assert.assertEquals("{\"apple\":1,\"banana\":2,\"pear\":3}", JSON.toJSONString(base));
        __CLR4_1_101esb1esblusqkcki.R.inc(65851);JSON.removeMixInAnnotations(BaseClass.class);
    }finally{__CLR4_1_101esb1esblusqkcki.R.flushNeeded();}}

    public void test_mixIn_extend1() throws Exception {__CLR4_1_101esb1esblusqkcki.R.globalSliceStart(getClass().getName(),65852);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9xlrh1et8();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101esb1esblusqkcki.R.rethrow($CLV_t2$);}finally{__CLR4_1_101esb1esblusqkcki.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinInheritanceTest.test_mixIn_extend1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),65852,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9xlrh1et8() throws Exception{try{__CLR4_1_101esb1esblusqkcki.R.inc(65852);
        __CLR4_1_101esb1esblusqkcki.R.inc(65853);BaseClass base = new BaseClass(1, 2,3);
        __CLR4_1_101esb1esblusqkcki.R.inc(65854);Assert.assertEquals("{\"a\":1,\"b\":2,\"c\":3}", JSON.toJSONString(base));

        __CLR4_1_101esb1esblusqkcki.R.inc(65855);JSON.addMixInAnnotations(BaseClass.class, SubMixIn1.class);
        __CLR4_1_101esb1esblusqkcki.R.inc(65856);Assert.assertEquals("{\"apple\":1,\"pear\":3,\"watermelon\":2}", JSON.toJSONString(base));
        __CLR4_1_101esb1esblusqkcki.R.inc(65857);JSON.removeMixInAnnotations(BaseClass.class);
    }finally{__CLR4_1_101esb1esblusqkcki.R.flushNeeded();}}
}
