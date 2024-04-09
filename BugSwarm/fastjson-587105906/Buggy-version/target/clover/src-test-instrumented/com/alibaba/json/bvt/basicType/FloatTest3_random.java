/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class FloatTest3_random extends TestCase {static class __CLR4_1_1012dw12dwlusqk0z9{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712688564785L,8589935092L,49789,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_ran() throws Exception {__CLR4_1_1012dw12dwlusqk0z9.R.globalSliceStart(getClass().getName(),49748);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rgzuvb12dw();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012dw12dwlusqk0z9.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012dw12dwlusqk0z9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49748,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rgzuvb12dw() throws Exception{try{__CLR4_1_1012dw12dwlusqk0z9.R.inc(49748);
        __CLR4_1_1012dw12dwlusqk0z9.R.inc(49749);Random rand = new Random();

        __CLR4_1_1012dw12dwlusqk0z9.R.inc(49750);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1012dw12dwlusqk0z9.R.iget(49751)!=0|true))||(__CLR4_1_1012dw12dwlusqk0z9.R.iget(49752)==0&false)); ++i) {{
            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49753);float val = rand.nextFloat();

            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49754);String str = JSON.toJSONString(new Model(val));
            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49755);Model m = JSON.parseObject(str, Model.class);

            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49756);assertEquals(val, m.value);
        }
    }}finally{__CLR4_1_1012dw12dwlusqk0z9.R.flushNeeded();}}

    public void test_ran_2() throws Exception {__CLR4_1_1012dw12dwlusqk0z9.R.globalSliceStart(getClass().getName(),49757);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u8hm8c12e5();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012dw12dwlusqk0z9.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012dw12dwlusqk0z9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49757,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u8hm8c12e5() throws Exception{try{__CLR4_1_1012dw12dwlusqk0z9.R.inc(49757);
        __CLR4_1_1012dw12dwlusqk0z9.R.inc(49758);Random rand = new Random();

        __CLR4_1_1012dw12dwlusqk0z9.R.inc(49759);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1012dw12dwlusqk0z9.R.iget(49760)!=0|true))||(__CLR4_1_1012dw12dwlusqk0z9.R.iget(49761)==0&false)); ++i) {{
            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49762);float val = rand.nextFloat();

            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49763);String str = JSON.toJSONString(new Model(val), SerializerFeature.BeanToArray);
            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49764);Model m = JSON.parseObject(str, Model.class, Feature.SupportArrayToBean);

            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49765);assertEquals(val, m.value);
        }
    }}finally{__CLR4_1_1012dw12dwlusqk0z9.R.flushNeeded();}}

    public void test_ran_3() throws Exception {__CLR4_1_1012dw12dwlusqk0z9.R.globalSliceStart(getClass().getName(),49766);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xhhl0t12ee();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012dw12dwlusqk0z9.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012dw12dwlusqk0z9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49766,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xhhl0t12ee() throws Exception{try{__CLR4_1_1012dw12dwlusqk0z9.R.inc(49766);
        __CLR4_1_1012dw12dwlusqk0z9.R.inc(49767);Random rand = new Random();

        __CLR4_1_1012dw12dwlusqk0z9.R.inc(49768);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1012dw12dwlusqk0z9.R.iget(49769)!=0|true))||(__CLR4_1_1012dw12dwlusqk0z9.R.iget(49770)==0&false)); ++i) {{
            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49771);float val = rand.nextFloat();

            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49772);String str = JSON.toJSONString(Collections.singletonMap("val", val));
            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49773);float val2 = JSON.parseObject(str).getFloatValue("val");

            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49774);assertEquals(val, val2);
        }
    }}finally{__CLR4_1_1012dw12dwlusqk0z9.R.flushNeeded();}}

    public void test_ran_4() throws Exception {__CLR4_1_1012dw12dwlusqk0z9.R.globalSliceStart(getClass().getName(),49775);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yami5u12en();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1012dw12dwlusqk0z9.R.rethrow($CLV_t2$);}finally{__CLR4_1_1012dw12dwlusqk0z9.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),49775,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yami5u12en() throws Exception{try{__CLR4_1_1012dw12dwlusqk0z9.R.inc(49775);
        __CLR4_1_1012dw12dwlusqk0z9.R.inc(49776);Random rand = new Random();

        __CLR4_1_1012dw12dwlusqk0z9.R.inc(49777);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1012dw12dwlusqk0z9.R.iget(49778)!=0|true))||(__CLR4_1_1012dw12dwlusqk0z9.R.iget(49779)==0&false)); ++i) {{
            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49780);float val = rand.nextFloat();

            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49781);HashMap map = new HashMap();
            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49782);map.put("val", val);
            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49783);String str = JSON.toJSONString(map);
            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49784);float val2 = JSON.parseObject(str).getFloatValue("val");

            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49785);assertEquals(val, val2);
        }
    }}finally{__CLR4_1_1012dw12dwlusqk0z9.R.flushNeeded();}}

    public static class Model {
        public float value;

        public Model() {try{__CLR4_1_1012dw12dwlusqk0z9.R.inc(49786);

        }finally{__CLR4_1_1012dw12dwlusqk0z9.R.flushNeeded();}}

        public Model(float value) {try{__CLR4_1_1012dw12dwlusqk0z9.R.inc(49787);
            __CLR4_1_1012dw12dwlusqk0z9.R.inc(49788);this.value = value;
        }finally{__CLR4_1_1012dw12dwlusqk0z9.R.flushNeeded();}}
    }
}
