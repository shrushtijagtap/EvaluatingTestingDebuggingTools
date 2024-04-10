/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class FloatTest3_random extends TestCase {static class __CLR4_5_212dl12dllusyjqxj{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712701995271L,8589935092L,49778,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_ran() throws Exception {__CLR4_5_212dl12dllusyjqxj.R.globalSliceStart(getClass().getName(),49737);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rgzuvb12dl();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212dl12dllusyjqxj.R.rethrow($CLV_t2$);}finally{__CLR4_5_212dl12dllusyjqxj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49737,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rgzuvb12dl() throws Exception{try{__CLR4_5_212dl12dllusyjqxj.R.inc(49737);
        __CLR4_5_212dl12dllusyjqxj.R.inc(49738);Random rand = new Random();

        __CLR4_5_212dl12dllusyjqxj.R.inc(49739);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_5_212dl12dllusyjqxj.R.iget(49740)!=0|true))||(__CLR4_5_212dl12dllusyjqxj.R.iget(49741)==0&false)); ++i) {{
            __CLR4_5_212dl12dllusyjqxj.R.inc(49742);float val = rand.nextFloat();

            __CLR4_5_212dl12dllusyjqxj.R.inc(49743);String str = JSON.toJSONString(new Model(val));
            __CLR4_5_212dl12dllusyjqxj.R.inc(49744);Model m = JSON.parseObject(str, Model.class);

            __CLR4_5_212dl12dllusyjqxj.R.inc(49745);assertEquals(val, m.value);
        }
    }}finally{__CLR4_5_212dl12dllusyjqxj.R.flushNeeded();}}

    public void test_ran_2() throws Exception {__CLR4_5_212dl12dllusyjqxj.R.globalSliceStart(getClass().getName(),49746);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u8hm8c12du();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212dl12dllusyjqxj.R.rethrow($CLV_t2$);}finally{__CLR4_5_212dl12dllusyjqxj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49746,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u8hm8c12du() throws Exception{try{__CLR4_5_212dl12dllusyjqxj.R.inc(49746);
        __CLR4_5_212dl12dllusyjqxj.R.inc(49747);Random rand = new Random();

        __CLR4_5_212dl12dllusyjqxj.R.inc(49748);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_5_212dl12dllusyjqxj.R.iget(49749)!=0|true))||(__CLR4_5_212dl12dllusyjqxj.R.iget(49750)==0&false)); ++i) {{
            __CLR4_5_212dl12dllusyjqxj.R.inc(49751);float val = rand.nextFloat();

            __CLR4_5_212dl12dllusyjqxj.R.inc(49752);String str = JSON.toJSONString(new Model(val), SerializerFeature.BeanToArray);
            __CLR4_5_212dl12dllusyjqxj.R.inc(49753);Model m = JSON.parseObject(str, Model.class, Feature.SupportArrayToBean);

            __CLR4_5_212dl12dllusyjqxj.R.inc(49754);assertEquals(val, m.value);
        }
    }}finally{__CLR4_5_212dl12dllusyjqxj.R.flushNeeded();}}

    public void test_ran_3() throws Exception {__CLR4_5_212dl12dllusyjqxj.R.globalSliceStart(getClass().getName(),49755);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xhhl0t12e3();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212dl12dllusyjqxj.R.rethrow($CLV_t2$);}finally{__CLR4_5_212dl12dllusyjqxj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49755,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xhhl0t12e3() throws Exception{try{__CLR4_5_212dl12dllusyjqxj.R.inc(49755);
        __CLR4_5_212dl12dllusyjqxj.R.inc(49756);Random rand = new Random();

        __CLR4_5_212dl12dllusyjqxj.R.inc(49757);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_5_212dl12dllusyjqxj.R.iget(49758)!=0|true))||(__CLR4_5_212dl12dllusyjqxj.R.iget(49759)==0&false)); ++i) {{
            __CLR4_5_212dl12dllusyjqxj.R.inc(49760);float val = rand.nextFloat();

            __CLR4_5_212dl12dllusyjqxj.R.inc(49761);String str = JSON.toJSONString(Collections.singletonMap("val", val));
            __CLR4_5_212dl12dllusyjqxj.R.inc(49762);float val2 = JSON.parseObject(str).getFloatValue("val");

            __CLR4_5_212dl12dllusyjqxj.R.inc(49763);assertEquals(val, val2);
        }
    }}finally{__CLR4_5_212dl12dllusyjqxj.R.flushNeeded();}}

    public void test_ran_4() throws Exception {__CLR4_5_212dl12dllusyjqxj.R.globalSliceStart(getClass().getName(),49764);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yami5u12ec();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_212dl12dllusyjqxj.R.rethrow($CLV_t2$);}finally{__CLR4_5_212dl12dllusyjqxj.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),49764,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yami5u12ec() throws Exception{try{__CLR4_5_212dl12dllusyjqxj.R.inc(49764);
        __CLR4_5_212dl12dllusyjqxj.R.inc(49765);Random rand = new Random();

        __CLR4_5_212dl12dllusyjqxj.R.inc(49766);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_5_212dl12dllusyjqxj.R.iget(49767)!=0|true))||(__CLR4_5_212dl12dllusyjqxj.R.iget(49768)==0&false)); ++i) {{
            __CLR4_5_212dl12dllusyjqxj.R.inc(49769);float val = rand.nextFloat();

            __CLR4_5_212dl12dllusyjqxj.R.inc(49770);HashMap map = new HashMap();
            __CLR4_5_212dl12dllusyjqxj.R.inc(49771);map.put("val", val);
            __CLR4_5_212dl12dllusyjqxj.R.inc(49772);String str = JSON.toJSONString(map);
            __CLR4_5_212dl12dllusyjqxj.R.inc(49773);float val2 = JSON.parseObject(str).getFloatValue("val");

            __CLR4_5_212dl12dllusyjqxj.R.inc(49774);assertEquals(val, val2);
        }
    }}finally{__CLR4_5_212dl12dllusyjqxj.R.flushNeeded();}}

    public static class Model {
        public float value;

        public Model() {try{__CLR4_5_212dl12dllusyjqxj.R.inc(49775);

        }finally{__CLR4_5_212dl12dllusyjqxj.R.flushNeeded();}}

        public Model(float value) {try{__CLR4_5_212dl12dllusyjqxj.R.inc(49776);
            __CLR4_5_212dl12dllusyjqxj.R.inc(49777);this.value = value;
        }finally{__CLR4_5_212dl12dllusyjqxj.R.flushNeeded();}}
    }
}
