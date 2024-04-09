/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class DoubleTest3_random extends TestCase {static class __CLR4_1_1012901290lusqk0wx{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,49613,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_ran() throws Exception {__CLR4_1_1012901290lusqk0wx.R.globalSliceStart(getClass().getName(),49572);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rgzuvb1290();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012901290lusqk0wx.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012901290lusqk0wx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49572,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rgzuvb1290() throws Exception{try{__CLR4_1_1012901290lusqk0wx.R.inc(49572);
        __CLR4_1_1012901290lusqk0wx.R.inc(49573);Random rand = new Random();

        __CLR4_1_1012901290lusqk0wx.R.inc(49574);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1012901290lusqk0wx.R.iget(49575)!=0|true))||(__CLR4_1_1012901290lusqk0wx.R.iget(49576)==0&false)); ++i) {{
            __CLR4_1_1012901290lusqk0wx.R.inc(49577);double val = rand.nextDouble();

            __CLR4_1_1012901290lusqk0wx.R.inc(49578);String str = JSON.toJSONString(new Model(val));
            __CLR4_1_1012901290lusqk0wx.R.inc(49579);Model m = JSON.parseObject(str, Model.class);

            __CLR4_1_1012901290lusqk0wx.R.inc(49580);assertEquals(val, m.value);
        }
    }}finally{__CLR4_1_1012901290lusqk0wx.R.flushNeeded();}}

    public void test_ran_2() throws Exception {__CLR4_1_1012901290lusqk0wx.R.globalSliceStart(getClass().getName(),49581);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u8hm8c1299();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012901290lusqk0wx.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012901290lusqk0wx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49581,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u8hm8c1299() throws Exception{try{__CLR4_1_1012901290lusqk0wx.R.inc(49581);
        __CLR4_1_1012901290lusqk0wx.R.inc(49582);Random rand = new Random();

        __CLR4_1_1012901290lusqk0wx.R.inc(49583);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1012901290lusqk0wx.R.iget(49584)!=0|true))||(__CLR4_1_1012901290lusqk0wx.R.iget(49585)==0&false)); ++i) {{
            __CLR4_1_1012901290lusqk0wx.R.inc(49586);double val = rand.nextDouble();

            __CLR4_1_1012901290lusqk0wx.R.inc(49587);String str = JSON.toJSONString(new Model(val), SerializerFeature.BeanToArray);
            __CLR4_1_1012901290lusqk0wx.R.inc(49588);Model m = JSON.parseObject(str, Model.class, Feature.SupportArrayToBean);

            __CLR4_1_1012901290lusqk0wx.R.inc(49589);assertEquals(val, m.value);
        }
    }}finally{__CLR4_1_1012901290lusqk0wx.R.flushNeeded();}}

    public void test_ran_3() throws Exception {__CLR4_1_1012901290lusqk0wx.R.globalSliceStart(getClass().getName(),49590);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xhhl0t129i();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012901290lusqk0wx.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012901290lusqk0wx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49590,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xhhl0t129i() throws Exception{try{__CLR4_1_1012901290lusqk0wx.R.inc(49590);
        __CLR4_1_1012901290lusqk0wx.R.inc(49591);Random rand = new Random();

        __CLR4_1_1012901290lusqk0wx.R.inc(49592);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1012901290lusqk0wx.R.iget(49593)!=0|true))||(__CLR4_1_1012901290lusqk0wx.R.iget(49594)==0&false)); ++i) {{
            __CLR4_1_1012901290lusqk0wx.R.inc(49595);double val = rand.nextDouble();

            __CLR4_1_1012901290lusqk0wx.R.inc(49596);String str = JSON.toJSONString(Collections.singletonMap("val", val));
            __CLR4_1_1012901290lusqk0wx.R.inc(49597);double val2 = JSON.parseObject(str).getDoubleValue("val");

            __CLR4_1_1012901290lusqk0wx.R.inc(49598);assertEquals(val, val2);
        }
    }}finally{__CLR4_1_1012901290lusqk0wx.R.flushNeeded();}}

    public void test_ran_4() throws Exception {__CLR4_1_1012901290lusqk0wx.R.globalSliceStart(getClass().getName(),49599);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yami5u129r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012901290lusqk0wx.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012901290lusqk0wx.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.DoubleTest3_random.test_ran_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49599,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yami5u129r() throws Exception{try{__CLR4_1_1012901290lusqk0wx.R.inc(49599);
        __CLR4_1_1012901290lusqk0wx.R.inc(49600);Random rand = new Random();

        __CLR4_1_1012901290lusqk0wx.R.inc(49601);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1012901290lusqk0wx.R.iget(49602)!=0|true))||(__CLR4_1_1012901290lusqk0wx.R.iget(49603)==0&false)); ++i) {{
            __CLR4_1_1012901290lusqk0wx.R.inc(49604);double val = rand.nextDouble();

            __CLR4_1_1012901290lusqk0wx.R.inc(49605);HashMap map = new HashMap();
            __CLR4_1_1012901290lusqk0wx.R.inc(49606);map.put("val", val);
            __CLR4_1_1012901290lusqk0wx.R.inc(49607);String str = JSON.toJSONString(map);
            __CLR4_1_1012901290lusqk0wx.R.inc(49608);double val2 = JSON.parseObject(str).getDoubleValue("val");

            __CLR4_1_1012901290lusqk0wx.R.inc(49609);assertEquals(val, val2);
        }
    }}finally{__CLR4_1_1012901290lusqk0wx.R.flushNeeded();}}

    public static class Model {
        public double value;

        public Model() {try{__CLR4_1_1012901290lusqk0wx.R.inc(49610);

        }finally{__CLR4_1_1012901290lusqk0wx.R.flushNeeded();}}

        public Model(double value) {try{__CLR4_1_1012901290lusqk0wx.R.inc(49611);
            __CLR4_1_1012901290lusqk0wx.R.inc(49612);this.value = value;
        }finally{__CLR4_1_1012901290lusqk0wx.R.flushNeeded();}}
    }
}
