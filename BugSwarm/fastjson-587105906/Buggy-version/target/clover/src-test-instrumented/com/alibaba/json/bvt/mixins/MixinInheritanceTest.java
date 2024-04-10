/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.mixins;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import junit.framework.TestCase;
import org.junit.Assert;

public class MixinInheritanceTest extends TestCase {static class __CLR4_1_101fqj1fqjluszwc2l{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,67090,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
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
        public int getIdo() {try{__CLR4_1_101fqj1fqjluszwc2l.R.inc(67051); __CLR4_1_101fqj1fqjluszwc2l.R.inc(67052);return 13; }finally{__CLR4_1_101fqj1fqjluszwc2l.R.flushNeeded();}}
        public String getNameo() {try{__CLR4_1_101fqj1fqjluszwc2l.R.inc(67053); __CLR4_1_101fqj1fqjluszwc2l.R.inc(67054);return "Bill"; }finally{__CLR4_1_101fqj1fqjluszwc2l.R.flushNeeded();}}
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

    public void test_field() throws Exception {__CLR4_1_101fqj1fqjluszwc2l.R.globalSliceStart(getClass().getName(),67055);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10vh3vws1fqn();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqj1fqjluszwc2l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqj1fqjluszwc2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinInheritanceTest.test_field",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67055,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10vh3vws1fqn() throws Exception{try{__CLR4_1_101fqj1fqjluszwc2l.R.inc(67055);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67056);JSON.addMixInAnnotations(Beano.class, BeanoMixinSub.class);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67057);String str = JSON.toJSONString(new Beano());
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67058);JSONObject result = JSONObject.parseObject(str);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67059);assertEquals(2, result.size());
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67060);if ((((!result.containsKey("id")
                || !result.containsKey("name"))&&(__CLR4_1_101fqj1fqjluszwc2l.R.iget(67061)!=0|true))||(__CLR4_1_101fqj1fqjluszwc2l.R.iget(67062)==0&false))) {{
            __CLR4_1_101fqj1fqjluszwc2l.R.inc(67063);fail("Should have both 'id' and 'name', but content = " + result);
        }
        }__CLR4_1_101fqj1fqjluszwc2l.R.inc(67064);JSON.removeMixInAnnotations(Beano.class);
    }finally{__CLR4_1_101fqj1fqjluszwc2l.R.flushNeeded();}}

    public void test_method() throws Exception {__CLR4_1_101fqj1fqjluszwc2l.R.globalSliceStart(getClass().getName(),67065);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_101xt2rv1fqx();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqj1fqjluszwc2l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqj1fqjluszwc2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinInheritanceTest.test_method",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67065,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_101xt2rv1fqx() throws Exception{try{__CLR4_1_101fqj1fqjluszwc2l.R.inc(67065);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67066);JSON.addMixInAnnotations(Beano2.class, BeanoMixinSub2.class);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67067);String str = JSON.toJSONString(new Beano2());
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67068);JSONObject result = JSONObject.parseObject(str);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67069);assertEquals(2, result.size());
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67070);assertTrue(result.containsKey("id"));
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67071);assertTrue(result.containsKey("name"));
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67072);JSON.removeMixInAnnotations(Beano2.class);
    }finally{__CLR4_1_101fqj1fqjluszwc2l.R.flushNeeded();}}

    static class BaseClass {
        public int a;
        public int b;
        public int c;

        public  BaseClass() {try{__CLR4_1_101fqj1fqjluszwc2l.R.inc(67073);

        }finally{__CLR4_1_101fqj1fqjluszwc2l.R.flushNeeded();}}
        public BaseClass(int a, int b,int c) {try{__CLR4_1_101fqj1fqjluszwc2l.R.inc(67074);
            __CLR4_1_101fqj1fqjluszwc2l.R.inc(67075);this.a = a;
            __CLR4_1_101fqj1fqjluszwc2l.R.inc(67076);this.b = b;
            __CLR4_1_101fqj1fqjluszwc2l.R.inc(67077);this.c = c;
        }finally{__CLR4_1_101fqj1fqjluszwc2l.R.flushNeeded();}}
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

    public void test_mixIn_extend() throws Exception {__CLR4_1_101fqj1fqjluszwc2l.R.globalSliceStart(getClass().getName(),67078);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10tq9igc1fra();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqj1fqjluszwc2l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqj1fqjluszwc2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinInheritanceTest.test_mixIn_extend",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67078,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10tq9igc1fra() throws Exception{try{__CLR4_1_101fqj1fqjluszwc2l.R.inc(67078);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67079);BaseClass base = new BaseClass(1, 2,3);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67080);Assert.assertEquals("{\"a\":1,\"b\":2,\"c\":3}", JSON.toJSONString(base));

        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67081);JSON.addMixInAnnotations(BaseClass.class, SubMixIn.class);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67082);Assert.assertEquals("{\"apple\":1,\"banana\":2,\"pear\":3}", JSON.toJSONString(base));
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67083);JSON.removeMixInAnnotations(BaseClass.class);
    }finally{__CLR4_1_101fqj1fqjluszwc2l.R.flushNeeded();}}

    public void test_mixIn_extend1() throws Exception {__CLR4_1_101fqj1fqjluszwc2l.R.globalSliceStart(getClass().getName(),67084);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10x9xlrh1frg();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_101fqj1fqjluszwc2l.R.rethrow($CLV_t2$);}finally{__CLR4_1_101fqj1fqjluszwc2l.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.mixins.MixinInheritanceTest.test_mixIn_extend1",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),67084,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10x9xlrh1frg() throws Exception{try{__CLR4_1_101fqj1fqjluszwc2l.R.inc(67084);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67085);BaseClass base = new BaseClass(1, 2,3);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67086);Assert.assertEquals("{\"a\":1,\"b\":2,\"c\":3}", JSON.toJSONString(base));

        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67087);JSON.addMixInAnnotations(BaseClass.class, SubMixIn1.class);
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67088);Assert.assertEquals("{\"apple\":1,\"pear\":3,\"watermelon\":2}", JSON.toJSONString(base));
        __CLR4_1_101fqj1fqjluszwc2l.R.inc(67089);JSON.removeMixInAnnotations(BaseClass.class);
    }finally{__CLR4_1_101fqj1fqjluszwc2l.R.flushNeeded();}}
}
