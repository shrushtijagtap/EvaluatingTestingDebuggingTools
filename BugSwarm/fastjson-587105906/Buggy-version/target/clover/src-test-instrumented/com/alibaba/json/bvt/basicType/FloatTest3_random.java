/* $$ This file has been instrumented by Clover 4.1.10#20230822161652967 $$ */package com.alibaba.json.bvt.basicType;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.Feature;
import com.alibaba.fastjson.serializer.SerializerFeature;
import junit.framework.TestCase;

import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class FloatTest3_random extends TestCase {static class __CLR4_1_1013c413c4luszw73t{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_1_10();if(20230822161652967L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.1.10#20230822161652967,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u002f\u0055\u0073\u0065\u0072\u0073\u002f\u0073\u0068\u0072\u0065\u0079\u0061\u0063\u0068\u0061\u0075\u0064\u0068\u0061\u0072\u0079\u002f\u0044\u0065\u0073\u006b\u0074\u006f\u0070\u002f\u0063\u0073\u0035\u0032\u0037\u002f\u0043\u0053\u0035\u0032\u0037\u002d\u0050\u0072\u006f\u006a\u0065\u0063\u0074\u002f\u0042\u0075\u0067\u0053\u0077\u0061\u0072\u006d\u002f\u0066\u0061\u0073\u0074\u006a\u0073\u006f\u006e\u002d\u0035\u0038\u0037\u0031\u0030\u0035\u0039\u0030\u0036\u002f\u0042\u0075\u0067\u0067\u0079\u002d\u0076\u0065\u0072\u0073\u0069\u006f\u006e\u002f\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1712704253720L,8589935092L,51021,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_1_10_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
    public void test_ran() throws Exception {__CLR4_1_1013c413c4luszw73t.R.globalSliceStart(getClass().getName(),50980);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10rgzuvb13c4();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013c413c4luszw73t.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013c413c4luszw73t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50980,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10rgzuvb13c4() throws Exception{try{__CLR4_1_1013c413c4luszw73t.R.inc(50980);
        __CLR4_1_1013c413c4luszw73t.R.inc(50981);Random rand = new Random();

        __CLR4_1_1013c413c4luszw73t.R.inc(50982);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1013c413c4luszw73t.R.iget(50983)!=0|true))||(__CLR4_1_1013c413c4luszw73t.R.iget(50984)==0&false)); ++i) {{
            __CLR4_1_1013c413c4luszw73t.R.inc(50985);float val = rand.nextFloat();

            __CLR4_1_1013c413c4luszw73t.R.inc(50986);String str = JSON.toJSONString(new Model(val));
            __CLR4_1_1013c413c4luszw73t.R.inc(50987);Model m = JSON.parseObject(str, Model.class);

            __CLR4_1_1013c413c4luszw73t.R.inc(50988);assertEquals(val, m.value);
        }
    }}finally{__CLR4_1_1013c413c4luszw73t.R.flushNeeded();}}

    public void test_ran_2() throws Exception {__CLR4_1_1013c413c4luszw73t.R.globalSliceStart(getClass().getName(),50989);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10u8hm8c13cd();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013c413c4luszw73t.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013c413c4luszw73t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran_2",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50989,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10u8hm8c13cd() throws Exception{try{__CLR4_1_1013c413c4luszw73t.R.inc(50989);
        __CLR4_1_1013c413c4luszw73t.R.inc(50990);Random rand = new Random();

        __CLR4_1_1013c413c4luszw73t.R.inc(50991);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1013c413c4luszw73t.R.iget(50992)!=0|true))||(__CLR4_1_1013c413c4luszw73t.R.iget(50993)==0&false)); ++i) {{
            __CLR4_1_1013c413c4luszw73t.R.inc(50994);float val = rand.nextFloat();

            __CLR4_1_1013c413c4luszw73t.R.inc(50995);String str = JSON.toJSONString(new Model(val), SerializerFeature.BeanToArray);
            __CLR4_1_1013c413c4luszw73t.R.inc(50996);Model m = JSON.parseObject(str, Model.class, Feature.SupportArrayToBean);

            __CLR4_1_1013c413c4luszw73t.R.inc(50997);assertEquals(val, m.value);
        }
    }}finally{__CLR4_1_1013c413c4luszw73t.R.flushNeeded();}}

    public void test_ran_3() throws Exception {__CLR4_1_1013c413c4luszw73t.R.globalSliceStart(getClass().getName(),50998);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10xhhl0t13cm();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013c413c4luszw73t.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013c413c4luszw73t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran_3",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),50998,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10xhhl0t13cm() throws Exception{try{__CLR4_1_1013c413c4luszw73t.R.inc(50998);
        __CLR4_1_1013c413c4luszw73t.R.inc(50999);Random rand = new Random();

        __CLR4_1_1013c413c4luszw73t.R.inc(51000);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1013c413c4luszw73t.R.iget(51001)!=0|true))||(__CLR4_1_1013c413c4luszw73t.R.iget(51002)==0&false)); ++i) {{
            __CLR4_1_1013c413c4luszw73t.R.inc(51003);float val = rand.nextFloat();

            __CLR4_1_1013c413c4luszw73t.R.inc(51004);String str = JSON.toJSONString(Collections.singletonMap("val", val));
            __CLR4_1_1013c413c4luszw73t.R.inc(51005);float val2 = JSON.parseObject(str).getFloatValue("val");

            __CLR4_1_1013c413c4luszw73t.R.inc(51006);assertEquals(val, val2);
        }
    }}finally{__CLR4_1_1013c413c4luszw73t.R.flushNeeded();}}

    public void test_ran_4() throws Exception {__CLR4_1_1013c413c4luszw73t.R.globalSliceStart(getClass().getName(),51007);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_1_10yami5u13cv();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_1_1013c413c4luszw73t.R.rethrow($CLV_t2$);}finally{__CLR4_1_1013c413c4luszw73t.R.globalSliceEnd(getClass().getName(),"com.alibaba.json.bvt.basicType.FloatTest3_random.test_ran_4",__CLR4_1_10_TEST_NAME_SNIFFER.getTestName(),51007,$CLV_p$,$CLV_t$);}}private void  __CLR4_1_10yami5u13cv() throws Exception{try{__CLR4_1_1013c413c4luszw73t.R.inc(51007);
        __CLR4_1_1013c413c4luszw73t.R.inc(51008);Random rand = new Random();

        __CLR4_1_1013c413c4luszw73t.R.inc(51009);for (int i = 0; (((i < 1000 * 1000 * 1)&&(__CLR4_1_1013c413c4luszw73t.R.iget(51010)!=0|true))||(__CLR4_1_1013c413c4luszw73t.R.iget(51011)==0&false)); ++i) {{
            __CLR4_1_1013c413c4luszw73t.R.inc(51012);float val = rand.nextFloat();

            __CLR4_1_1013c413c4luszw73t.R.inc(51013);HashMap map = new HashMap();
            __CLR4_1_1013c413c4luszw73t.R.inc(51014);map.put("val", val);
            __CLR4_1_1013c413c4luszw73t.R.inc(51015);String str = JSON.toJSONString(map);
            __CLR4_1_1013c413c4luszw73t.R.inc(51016);float val2 = JSON.parseObject(str).getFloatValue("val");

            __CLR4_1_1013c413c4luszw73t.R.inc(51017);assertEquals(val, val2);
        }
    }}finally{__CLR4_1_1013c413c4luszw73t.R.flushNeeded();}}

    public static class Model {
        public float value;

        public Model() {try{__CLR4_1_1013c413c4luszw73t.R.inc(51018);

        }finally{__CLR4_1_1013c413c4luszw73t.R.flushNeeded();}}

        public Model(float value) {try{__CLR4_1_1013c413c4luszw73t.R.inc(51019);
            __CLR4_1_1013c413c4luszw73t.R.inc(51020);this.value = value;
        }finally{__CLR4_1_1013c413c4luszw73t.R.flushNeeded();}}
    }
}
