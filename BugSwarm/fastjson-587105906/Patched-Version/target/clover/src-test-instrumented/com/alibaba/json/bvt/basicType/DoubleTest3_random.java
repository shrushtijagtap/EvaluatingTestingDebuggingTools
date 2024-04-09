/* $$ This file has been instrumented by Clover 4.5.2#20240131180750 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class DoubleTest3_random extends TestCase {static class __CLR4_5_2136x136xlusvn4s3{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_5_2();if(20240131180750L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation shall match the runtime version.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.5.2#20240131180750,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0050\u0061\u0074\u0063\u0068\u0065\u0064\u002d\u0056\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712697112024L,8589935092L,50834,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_5_2_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_ran() throws Exception {__CLR4_5_2136x136xlusvn4s3.R.globalSliceStart(getClass().getName(),50793);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2rgzuvb136x();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2136x136xlusvn4s3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2136x136xlusvn4s3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50793,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2rgzuvb136x() throws Exception{try{__CLR4_5_2136x136xlusvn4s3.R.inc(50793);
        __CLR4_5_2136x136xlusvn4s3.R.inc(50794);Random rand = new Random();

        __CLR4_5_2136x136xlusvn4s3.R.inc(50795);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_5_2136x136xlusvn4s3.R.iget(50796)!=0|true))||(__CLR4_5_2136x136xlusvn4s3.R.iget(50797)==0&false)); ++i) {{
            __CLR4_5_2136x136xlusvn4s3.R.inc(50798);double val = rand.nextDouble();

            __CLR4_5_2136x136xlusvn4s3.R.inc(50799);String str = JSON.toJSONString(new Model(val));
            __CLR4_5_2136x136xlusvn4s3.R.inc(50800);Model m = JSON.parseObject(str, Model.class);

            __CLR4_5_2136x136xlusvn4s3.R.inc(50801);assertEquals(val, m.value);
        }
    }}finally{__CLR4_5_2136x136xlusvn4s3.R.flushNeeded();}}

    public void test_ran_2() throws Exception {__CLR4_5_2136x136xlusvn4s3.R.globalSliceStart(getClass().getName(),50802);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2u8hm8c1376();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2136x136xlusvn4s3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2136x136xlusvn4s3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran_2",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50802,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2u8hm8c1376() throws Exception{try{__CLR4_5_2136x136xlusvn4s3.R.inc(50802);
        __CLR4_5_2136x136xlusvn4s3.R.inc(50803);Random rand = new Random();

        __CLR4_5_2136x136xlusvn4s3.R.inc(50804);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_5_2136x136xlusvn4s3.R.iget(50805)!=0|true))||(__CLR4_5_2136x136xlusvn4s3.R.iget(50806)==0&false)); ++i) {{
            __CLR4_5_2136x136xlusvn4s3.R.inc(50807);double val = rand.nextDouble();

            __CLR4_5_2136x136xlusvn4s3.R.inc(50808);String str = JSON.toJSONString(new Model(val), SerializerFeature.BeanToArray);
            __CLR4_5_2136x136xlusvn4s3.R.inc(50809);Model m = JSON.parseObject(str, Model.class, Feature.SupportArrayToBean);

            __CLR4_5_2136x136xlusvn4s3.R.inc(50810);assertEquals(val, m.value);
        }
    }}finally{__CLR4_5_2136x136xlusvn4s3.R.flushNeeded();}}

    public void test_ran_3() throws Exception {__CLR4_5_2136x136xlusvn4s3.R.globalSliceStart(getClass().getName(),50811);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2xhhl0t137f();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2136x136xlusvn4s3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2136x136xlusvn4s3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran_3",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50811,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2xhhl0t137f() throws Exception{try{__CLR4_5_2136x136xlusvn4s3.R.inc(50811);
        __CLR4_5_2136x136xlusvn4s3.R.inc(50812);Random rand = new Random();

        __CLR4_5_2136x136xlusvn4s3.R.inc(50813);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_5_2136x136xlusvn4s3.R.iget(50814)!=0|true))||(__CLR4_5_2136x136xlusvn4s3.R.iget(50815)==0&false)); ++i) {{
            __CLR4_5_2136x136xlusvn4s3.R.inc(50816);double val = rand.nextDouble();

            __CLR4_5_2136x136xlusvn4s3.R.inc(50817);String str = JSON.toJSONString(Collections.singletonMap("val", val));
            __CLR4_5_2136x136xlusvn4s3.R.inc(50818);double val2 = JSON.parseObject(str).getDoubleValue("val");

            __CLR4_5_2136x136xlusvn4s3.R.inc(50819);assertEquals(val, val2);
        }
    }}finally{__CLR4_5_2136x136xlusvn4s3.R.flushNeeded();}}

    public void test_ran_4() throws Exception {__CLR4_5_2136x136xlusvn4s3.R.globalSliceStart(getClass().getName(),50820);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_5_2yami5u137o();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_5_2136x136xlusvn4s3.R.rethrow($CLV_t2$);}finally{__CLR4_5_2136x136xlusvn4s3.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran_4",__CLR4_5_2_TEST_NAME_SNIFFER.getTestName(),50820,$CLV_p$,$CLV_t$);}}private void  __CLR4_5_2yami5u137o() throws Exception{try{__CLR4_5_2136x136xlusvn4s3.R.inc(50820);
        __CLR4_5_2136x136xlusvn4s3.R.inc(50821);Random rand = new Random();

        __CLR4_5_2136x136xlusvn4s3.R.inc(50822);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_5_2136x136xlusvn4s3.R.iget(50823)!=0|true))||(__CLR4_5_2136x136xlusvn4s3.R.iget(50824)==0&false)); ++i) {{
            __CLR4_5_2136x136xlusvn4s3.R.inc(50825);double val = rand.nextDouble();

            __CLR4_5_2136x136xlusvn4s3.R.inc(50826);HashMap map = new HashMap();
            __CLR4_5_2136x136xlusvn4s3.R.inc(50827);map.put("val", val);
            __CLR4_5_2136x136xlusvn4s3.R.inc(50828);String str = JSON.toJSONString(map);
            __CLR4_5_2136x136xlusvn4s3.R.inc(50829);double val2 = JSON.parseObject(str).getDoubleValue("val");

            __CLR4_5_2136x136xlusvn4s3.R.inc(50830);assertEquals(val, val2);
        }
    }}finally{__CLR4_5_2136x136xlusvn4s3.R.flushNeeded();}}

    public static class Model {
        public double value;

        public Model() {try{__CLR4_5_2136x136xlusvn4s3.R.inc(50831);

        }finally{__CLR4_5_2136x136xlusvn4s3.R.flushNeeded();}}

        public Model(double value) {try{__CLR4_5_2136x136xlusvn4s3.R.inc(50832);
            __CLR4_5_2136x136xlusvn4s3.R.inc(50833);this.value = value;
        }finally{__CLR4_5_2136x136xlusvn4s3.R.flushNeeded();}}
    }
}
